package com.duckrace;

import com.duckrace.enumeration.Reward;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Board implements Serializable {
    private static final String DATA_FILE_PATH = "data/board.dat";
    public static Board getInstance() {
        Board board = null;
        if(Files.exists(Path.of(DATA_FILE_PATH))) {
            try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(DATA_FILE_PATH)) ) {
                board = (Board) in.readObject();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            board = new Board();
        }

        return board;
    }

    private final Map<Integer,String> studentIdMap = loadStudentIdMap();
    private final Map<Integer,DuckRacer> racerMap  = new TreeMap<>();

    private Board() {
    }

    /*
     * Updates the board (racerMap) by making a DuckRacer "win."
     *
     * This could mean fetching an existing DuckRacer from racerMap (id is in the map),
     * or we might need to create a new DuckRacer (id is not in the map),
     * then we need to put that new DuckRacer in the map, and make it "win."
     *
     * Either way, it needs to "win."
     */
    public void update(int id, Reward reward) {
        DuckRacer racer = null;

        if (racerMap.containsKey(id)) {  // id present, so fetch DuckRacer next to it
            racer = racerMap.get(id);
        }
        else {                           // id not present, so create new DuckRacer
            racer = new DuckRacer(id, studentIdMap.get(id));
            racerMap.put(id, racer);     // easy to forget this step
        }
        racer.win(reward);
        save(); // either way, it needs to "win"
    }

    private void save() {
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(DATA_FILE_PATH))) {
            out.writeObject(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Collection<DuckRacer> duckRacers() {
        return racerMap.values();
    }

    public int maxId() {
        return studentIdMap.size();
    }

    private Map<Integer,String> loadStudentIdMap() {
        Map<Integer,String> idMap = new HashMap<>();

        try {
            // read all lines from conf/student-ids.csv into a List<String>
            List<String> lines = Files.readAllLines(Path.of("conf/student-ids.csv"));

            // for each line, split it into "tokens," i.e., "1,Aaron" is split into "1" and "Aaron"
            for (String line : lines) {
                String[] tokens = line.split(",");  // tokens[0] is "1" and tokens[1] is "Aaron"
                idMap.put(Integer.valueOf(tokens[0]), tokens[1]);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return idMap;
    }
}