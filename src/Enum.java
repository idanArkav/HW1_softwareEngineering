public class Enum {
    String direction;
    public Enum (String direction) {
        String[] directions = {"UP", "DOWN", "RIGHT", "LEFT"};
        for (String legitDirection : directions) {
            if (direction.equals(legitDirection)) {
                this.direction = direction;
                return;
            }
        }
        this.direction = "UP"; //default value
    }
    public String getDirection() {
        return this.direction;
    }
    public void setDirectionRight() {
        this.direction = "RIGHT";
    }
    public void setDirectionLeft() {
        this.direction = "LEFT";
    }
    public void setDirectionUp() {
        this.direction = "UP";
    }
    public void setDirectionDown() {
        this.direction = "DOWN";
    }
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Enum)) {
            return false;
        }
        Enum otherEnum = (Enum) other;
        return this.direction.equals(otherEnum.getDirection());
    }
}
