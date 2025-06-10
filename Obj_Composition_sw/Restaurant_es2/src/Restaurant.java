public class Restaurant {
    private String name;
    private Drink[] drinks;
    private Dish[] dishes;

    public Restaurant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Drink[] getDrinks() {
        return drinks;
    }

    public Dish[] getDishes() {
        return dishes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDrinks(Drink[] drinks) {
        this.drinks = drinks;
    }

    public void setDishes(Dish[] dishes) {
        this.dishes = dishes;
    }

    public void infoMenu() {
        System.out.println("Menù del ristorante " + this.name + ":");
        System.out.println("-----CIBO-----");
        for (Dish dish : dishes) {
            System.out.println(dish.getName() + " - $" + dish.getPrice());
            System.out.println("---Ingredienti---");
            for (String ingredient : dish.getIngredients()) {
                System.out.println(ingredient);
            }
        }
        System.out.println("-----BEVANDE-----");
        for (Drink drink : drinks) {
            System.out.println(drink.getName() + " - $" + drink.getPrice());
        }
    }

}
