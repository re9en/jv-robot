package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Direction currentDirection = robot.getDirection();

        if (robot.getX() > toX) {
            while (currentDirection.equals(Direction.LEFT)) {
                robot.turnLeft();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
            System.out.println("X is finished");
        } else if (robot.getX() < toX) {
            while (currentDirection.equals(Direction.RIGHT)) {
                robot.turnLeft();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }

        }
        if (robot.getY() > toY) {
            while (currentDirection.equals(Direction.DOWN)) {
                robot.turnLeft();
            }
            while (robot.getY() != toY) {
                robot.stepForward();
            }
            System.out.println("Y is finished");
        } else if (robot.getY() < toY) {
            while (currentDirection.equals(Direction.UP)) {
                robot.turnLeft();
            }
            while (robot.getX() != toY) {
                robot.stepForward();
            }

            if ((robot.getX() == toX) && (robot.getY() == toY)) {
            System.out.println("Y and X is finished");
            }
        }
    }
}
