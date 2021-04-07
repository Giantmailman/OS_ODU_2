//Liam Robb, lr003
public enum ProcessStatus {
    FREE(0), TAKEN(1), BLOCKED(2);

    private final int id;
    ProcessStatus(int id) {this.id = id;}
    public int getValue() {return id;}

}
