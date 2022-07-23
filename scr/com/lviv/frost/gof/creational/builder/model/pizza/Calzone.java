package com.lviv.frost.gof.creational.builder.model.pizza;

public class Calzone extends Pizza {
    private final boolean sauceInside;

    public static class Builder extends Pizza.Builder<Builder> {
        private boolean sauceInside = false; //Default

        public Builder sauceInside() {
            this.sauceInside = true;
            return this;
        }

        //covariant return type
        //it allows clients to use these builders without the need for casting
        @Override
        public Calzone build() {
            return new Calzone(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    public Calzone(Builder builder) {
        super(builder);
        this.sauceInside = builder.sauceInside;
    }
}
