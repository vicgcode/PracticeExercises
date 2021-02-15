package com.company.games;

import java.util.Scanner;

/**
 * The position of the robot in this field is described by two integer coordinates
 * The X axis is oriented from left to right, the Y axis — from bottom to top
 * It's also known where the robot looks: up, down, to the right or to the left
 * You need to bring the robot to the destination point of the game field
 */
public class RobotGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input the initial state of this robot:");
        System.out.print("x: ");
        int x = scanner.nextInt();
        System.out.print("y: ");
        int y = scanner.nextInt();
        System.out.println("Please, input the target values:");
        System.out.print("x: ");
        int toX = scanner.nextInt();
        System.out.print("y: ");
        int toY = scanner.nextInt();
        System.out.println("Please, choose the direction of the robot\n1 - UP\n2 - DOWN\n3 - LEFT\n4 - RIGHT");
        int dir = scanner.nextInt();
        Robot robot = new Robot(x, y, getDirection(dir));
        Move.moveRobot(robot, toX, toY);
    }

    public static Direction getDirection(int n) {
        switch (n) {
            case 1:
                return Direction.UP;
            case 2:
                return Direction.DOWN;
            case 3:
                return Direction.LEFT;
            case 4:
                return Direction.RIGHT;
            default:
                throw new IllegalStateException();
        }
    }
}

class Move {
    public static void moveRobot(Robot robot, int toX, int toY) {
        if (Math.abs(toX - robot.getX()) != 0 && Math.abs(toY - robot.getY()) != 0) {
            moveX(robot, toX);
            moveY(robot, toY);
        } else if (Math.abs(toX - robot.getX()) != 0) {
            moveX(robot, toX);
        } else {
            moveY(robot, toY);
        }
        System.out.println(robot.getX());
        System.out.println(robot.getY());

    }

    public static void moveX(Robot robot, int toX) {
        boolean isRight = toX > robot.getX();
        int steps = Math.abs(toX - robot.getX());
        if (isRight) {
            switch (robot.getDirection()) {
                case UP:
                    robot.turnRight();
                    break;
                case LEFT:
                    robot.turnRight();
                    robot.turnRight();
                    break;
                case DOWN:
                    robot.turnLeft();
                    break;
            }
        } else {
            switch (robot.getDirection()) {
                case UP:
                    robot.turnLeft();
                    break;
                case RIGHT:
                    robot.turnRight();
                    robot.turnRight();
                    break;
                case DOWN:
                    robot.turnRight();
                    break;
            }
        }
        while (steps > 0) {
            robot.stepForward();
            --steps;
        }
    }
    public static void moveY(Robot robot, int toY) {
        boolean isUp = toY > robot.getY();
        int steps = Math.abs(toY - robot.getY());
        if (isUp) {
            switch (robot.getDirection()) {
                case RIGHT:
                    robot.turnLeft();
                    break;
                case LEFT:
                    robot.turnRight();;
                    break;
                case DOWN:
                    robot.turnRight();;
                    robot.turnRight();;
                    break;
            }
        } else {
            switch (robot.getDirection()) {
                case UP:
                    robot.turnRight();
                    robot.turnRight();
                    break;
                case RIGHT:
                    robot.turnRight();
                    break;
                case LEFT:
                    robot.turnLeft();
                    break;
            }
        }
        while (steps > 0) {
            robot.stepForward();
            --steps;
        }
    }
}

//Don't change code below

enum Direction {
    UP(0, 1),
    DOWN(0, -1),
    LEFT(-1, 0),
    RIGHT(1, 0);

    private final int dx;
    private final int dy;

    Direction(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public Direction turnLeft() {
        switch (this) {
            case UP:
                return LEFT;
            case DOWN:
                return RIGHT;
            case LEFT:
                return DOWN;
            case RIGHT:
                return UP;
            default:
                throw new IllegalStateException();
        }
    }

    public Direction turnRight() {
        switch (this) {
            case UP:
                return RIGHT;
            case DOWN:
                return LEFT;
            case LEFT:
                return UP;
            case RIGHT:
                return DOWN;
            default:
                throw new IllegalStateException();
        }
    }

    public int dx() {
        return dx;
    }

    public int dy() {
        return dy;
    }
}

class Robot {
    private int x;
    private int y;
    private Direction direction;

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void turnLeft() {
        direction = direction.turnLeft();
    }

    public void turnRight() {
        direction = direction.turnRight();
    }

    public void stepForward() {
        x += direction.dx();
        y += direction.dy();
    }

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
