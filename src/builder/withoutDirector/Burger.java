package builder.withoutDirector;

/**
 * Most Common Way to implement builder pattern is to have Builder class as innner class because : - You might have seen at most of the places. -Joshua Bloch's Builder pattern
 * 1. We don't want to expose our constructor which eventually creates confusion at later stage.
 * 2. We don't want to have in-consistent object by having setters exposed.
 * 3. Now since constructor is private we will need inner class to access that. - Which will have same inputs what we have in class. But without getters.
 */
public class Burger {

    private String size;
    private boolean egg;
    private boolean extraCheese;
    private boolean mayonese;
    private boolean onion;
    private boolean lettuce;

    // It is private constructor so user will not be able to call it, Instead BurgerBuilder will call it (Inner classes have access to private stuff of Outer class)
    private Burger(BurgerBuilder burgerBuilder) {
        // Initialize all fields and you can also add validations.
        // Like to make a burger , bread is necessary incredient so apply validations that whether it has bread or not.
    }

    // These are all getters method
    public String getSize() {
        return size;
    }

    public boolean isEgg() {
        return egg;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public boolean isMayonese() {
        return mayonese;
    }

    public boolean isOnion() {
        return onion;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    //Return same object everytime that is builder instance
    //Once build method invoke return actual object.
    public static class BurgerBuilder {

        // We have added the same properties here thet were in thr Burger class
        private String size;
        private boolean egg;
        private boolean extraCheese;
        private boolean mayonese;
        private boolean onion;
        private boolean lettuce;

        // Now these are all the methods to set the attributes of BurgerBuilder object ans return the BurgerBuilder object itself
        public BurgerBuilder size(String size) {
            this.size = size;
            return this;
        }
        public BurgerBuilder egg(boolean egg) {
            this.egg = egg;
            return this;
        }
        public BurgerBuilder extraCheese(boolean extraCheese) {
            this.extraCheese = extraCheese;
            return this;
        }
        public BurgerBuilder mayonese(boolean mayonese) {
            this.mayonese = mayonese;
            return this;
        }
        public BurgerBuilder onion(boolean onion) {
            this.onion = onion;
            return this;
        }
        public BurgerBuilder lettuce(boolean lettuce) {
            this.lettuce = lettuce;
            return this;
        }

        // Now this build method will create the entire object for us.
        // But this time it is returning Burger not BurgerBuilder.
        // It is calling Burger class constructor
        public Burger build() {
            return new Burger(this);
            // 1) Now inside Burger Constructor apply some validations
            // 2) And jo attributes BurgerBuilder pr hai vahi attributes Burger ke set kro
        }
    }
}
