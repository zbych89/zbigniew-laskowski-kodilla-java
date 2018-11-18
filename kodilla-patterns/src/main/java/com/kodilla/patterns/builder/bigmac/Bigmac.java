package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Bigmac {
    private boolean bun = false;
    private int burgers;
    private String sauce;
    private List<String> ingredients;

    public boolean isBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    private Bigmac(boolean bun, int burgers, String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public static class BigmacBuilder{
        public enum Ingredient{
            LETTUCE,
            ONION,
            BACON,
            PICKLES,
            PEPPERS,
            MUSHROOMS,
            SHRIMPS,
            CHEESE;
        }

        private boolean bun = false;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder sesame(){
            this.bun = true;
            return this;
        }
        public BigmacBuilder burgers(int number){
            this.burgers = number;
            return this;
        }
        public BigmacBuilder sauce(String sauceType){
            this.sauce = sauceType;
            return this;
        }
        public BigmacBuilder add(String ingredient){
            if(Ingredient.valueOf(ingredient)!=null){
                this.ingredients.add(ingredient);
                return this;
            }
            throw new IllegalStateException("Ingredient not available");
        }
        public Bigmac build(){
            return new Bigmac(bun,burgers,sauce,ingredients);
        }
    }
}
