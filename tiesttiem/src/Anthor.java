public class Anthor {
    private String name;
    private int year;

    public Anthor(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Phương thức gộp chỉ gộp thuộc tính year
    public void merge(Anthor other) {
        this.year += other.year;
    }

    @Override
    public String toString() {
        return "Anthor{name='" + name + "', year=" + year + "}";
    }
}
