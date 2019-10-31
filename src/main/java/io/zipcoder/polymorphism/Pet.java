package io.zipcoder.polymorphism;

public class Pet implements Comparable<Pet>{

    private String name;

    public Pet (String name) {
        this.name = name;
    }

    public Pet (String name, String type) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String speak() {
        return "<Insert generic animal noise>";
    }

    public String outputPet () {
        String[] className;
        className = this.getClass().getName().split("\\.");

        return String.format("Pet: %s   Type: %s  Says: %s", this.getName(), className[className.length-1], this.speak());
    }

    public int compareTo(Pet pet2) {
        if (!this.name.equals(pet2.getName())) {
            return this.name.compareTo(pet2.getName());
        } else {
            return this.getClass().getName().compareTo(pet2.getClass().getName());
        }
    }
}
