import java.io.IOException;

public class Map {
    private Tile [][] tiles;    // a Map is a collection of tiles

    public Map (){
        tiles = new Tile [1][1];            // default Map is a 1x1 grid.
    } // Map constructor

    public Map (int xSize, int ySize) {     // Map with specific size
        tiles = new Tile [xSize][ySize];
        for (int x = 1; x <= xSize ; x++){
            for (int y = 1; y <= ySize ; y++){
                try {
                    tiles [x][y] = new Tile();
                } catch (IOException e) {
                    e.printStackTrace();
                } // try catch
            } // for y
        } // for x
    } // Map constructor 2

    public int getXSize (){
        return tiles.length;
    } // getXSize method

    public int getYSize (){
        return tiles[0].length;
    } // getYSize method
} // Map class
