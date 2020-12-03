package Lab11.exercise2;

//Product.java
/*A simple instantiable class definition for a Product*/

public class Product {
    private int id;
    private String name;
    private String description;


    public  Product(int id,String name,String description){
        setId(id);
        setName(name);
        setDescription(description);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString(){
        return "id: " + getId() + "  name: " + getName() + "  description: " + getDescription();
    }
}
