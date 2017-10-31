package se.cygni.snake;

import se.cygni.snake.api.event.MapUpdateEvent;
import se.cygni.snake.api.model.Map;
import se.cygni.snake.api.model.SnakeDirection;
import se.cygni.snake.api.model.SnakeInfo;
import se.cygni.snake.client.MapUtil;

public class SnakeBrain {
    public SnakeDirection getNextMove(MapUpdateEvent mapUpdateEvent){
        Map map = mapUpdateEvent.getMap();
        SnakeInfo[] snakeInfos = map.getSnakeInfos();

        for (int x=0; x<map.getWidth(); x++){
            for (int y=0; y< map.getHeight(); y++){

            }
        }
    }

    private double tileValue(Snake){

    }
}
