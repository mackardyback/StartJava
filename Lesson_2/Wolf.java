class Wolf {
    private String name;
    private String gender;
    private String color;
    private int age;
    private float weight;

    public void go() {
        System.out.println("Идет");
    }

    public void sit() {
        System.out.println("Сидит");
    }

    public void run() {
        System.out.println("Бежит");
    }

    public void howl() {
        System.out.println("Воет");
    }

    public void hunting() {
        System.out.println("Охотится");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}