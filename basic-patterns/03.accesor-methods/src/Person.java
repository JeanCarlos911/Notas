public class enum Person {
    // always private atributtes and only edited by the accesors methods for maintability
    private int age;
    private boolean adult;

    // getter of a no boolean atribute
    public int getAge() {
        return age;
    }

    // setter
    public void setAge(int age) {
        if(age < 0) {
            this.age = 0;
        }
        else {
            this.age = age;
        }
    }

    // getter of a boolean
    public isAdult() {
        return adult;
    }

    // setter
    public void setAdult(boolean adult) {
        this.adult = adult;
    }
}
