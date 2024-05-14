public class App {
    public static void main(String[] args) throws Exception {
        Mazes m = new Mazes();
        m.generateMaze(11, 13);
        m.printMaze(MazeType.BETTERCHARACTER);
    }
}
