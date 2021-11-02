package Project;

public abstract class Calcul implements E {
    private int PretVanzare=1500;
    private int CapacitateProductie=500;
    private int CostuldeProductie=1000;

    public Calcul() {
        this.PretVanzare = PretVanzare;
        this.CapacitateProductie = CapacitateProductie;
        this.CostuldeProductie= CostuldeProductie;
    }
    public int getPretVanzare() {
        return PretVanzare;
    }

    public void setPretVanzare(int pretVanzare) {
        this.PretVanzare = PretVanzare;
    }

    public int getCapacitatedeProductie() {
        return CapacitateProductie;
    }

    public void setCapacitateProductie(int CapacitateProductie) {
        this.CapacitateProductie = CapacitateProductie;
    }

    public int getCostuldeProductie() {
        return CostuldeProductie;
    }

    public void setCostuldeProductie(int CostuldeProductie) {
        this.CostuldeProductie = CostuldeProductie;
    }
}
