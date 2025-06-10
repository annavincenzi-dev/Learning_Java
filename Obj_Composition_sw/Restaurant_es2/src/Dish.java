public class Dish extends MenuItem {
    private String[] ingredients;

    public Dish(String name, int price, String[] ingredients) {
        super(name, price);
        this.ingredients = ingredients;
    }

    public String[] getIngredients() {
        return ingredients;
    }
}
