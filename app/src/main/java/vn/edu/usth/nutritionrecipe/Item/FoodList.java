package vn.edu.usth.nutritionrecipe.Item;
public class FoodList {
    public String name;
    public String time;
    int ingredients, description;
    public int image;
    public String protein;

    public FoodList(String name, String time, int ingredients, int description, int image, String protein) {
        //Initialize for corresponding fields
        this.name = name;
        this.time = time;
        this.ingredients = ingredients;
        this.description = description;
        this.image = image;
        this.protein = protein;
    }

    //Getter for corresponding fields
    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }

    public int getIngredients() {
        return ingredients;
    }

    public int getDescription() {
        return description;
    }

    public int getImage() {
        return image;
    }
}
