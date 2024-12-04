class Object {
    int hours;
    int minutes;

    public Object(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public void addTime(Object secondObject) {
        int totalMinutes = this.minutes + secondObject.minutes;
        int totalHours = this.hours + secondObject.hours;

        if (totalMinutes >= 60) {
            totalHours++;
            totalMinutes -= 60;
        }

        System.out.println("Total time: " + totalHours + " hours and " + totalMinutes + " minutes");
    }
}
class Main {
    public static void main(String[] args) {
        Object object1 = new Object(2, 30);
        Object object2 = new Object(3, 45);

        object1.addTime(object2);
    }
}