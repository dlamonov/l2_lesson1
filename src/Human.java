public class Human {
    private String name;
    private int runDistance;
    private int jumpHeight;
    private boolean successfulRun;
    private boolean successfulJump;

    public Human(String name, int runDistance, int jumpHeight) {
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    public void run(ObstacleTrack track) {
        successfulRun = track.runTrack(runDistance);
    }

    public void infoRun() {
        if (successfulRun) {
            System.out.println(String.format("Человек %s успешно пробежал дистанцию", name));
        } else {
            System.out.println(String.format("Человек %s не смог пробежать дистанцию", name));
        }
    }

    public void jump(ObstacleWall wall) {
        successfulJump = wall.jumpWall(jumpHeight);
    }

    public void infoJump() {
        if (successfulJump) {
            System.out.println(String.format("Человек %s успешно перепрыгнул через стену", name));
        } else {
            System.out.println(String.format("Человек %s не смог перепрыгнуть через стену", name));
        }
    }
}
