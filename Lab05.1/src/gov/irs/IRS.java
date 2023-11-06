package gov.irs;

public interface IRS {
    void collectTaxes();
    void register(TaxPayer taxPayer);

    static IRS getInstance() {
        return IRSEnum.INSTANCE;
    }
}