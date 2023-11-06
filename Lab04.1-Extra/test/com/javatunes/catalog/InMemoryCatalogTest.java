package com.javatunes.catalog;

import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.*;

public class InMemoryCatalogTest {
    private InMemoryCatalog catalog;

    @Before
    public void setUp() {
        catalog = new InMemoryCatalog();
    }

    @Test
    public void findByCategory_shouldReturnCollection() {
        Collection<MusicItem> items = catalog.findByCategory(MusicCategory.POP);
        for(MusicItem i : items) {
            assertEquals(i.getMusicCategory(), MusicCategory.POP);
        }
        assertEquals(4, items.size());
    }

    @Test
    public void longNamehere() {
        assertEquals(10, catalog.size());
    }

    @Test
    public void findByCategory_shouldReturn_categoryNotFound() {
        Collection<MusicItem> items = catalog.findByCategory(MusicCategory.JAZZ);
        assertTrue(items.isEmpty());
    }

    @Test
    public void findById_shouldReturnMusicItemFound_idFound() {
        MusicItem item = catalog.findById(16L);
        assertEquals(16L, (long) item.getId());
    }

    @Test
    public void findById_ShouldReturnNull_whenIdNotFound() {
        MusicItem item = catalog.findById(19L);
        assertNull(item);
        assertTrue(item == null);
    }
}
