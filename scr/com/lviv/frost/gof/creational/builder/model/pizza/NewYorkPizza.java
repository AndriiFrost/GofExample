package com.lviv.frost.gof.creational.builder.model.pizza;

import java.util.Objects;

public class NewYorkPizza extends Pizza {
    private final Size size;

    public static class Builder extends Pizza.Builder<Builder> {
        private final Size size;

        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        //covariant return type
        //it allows clients to use these builders without the need for casting
        @Override
        public NewYorkPizza build() {
            return new NewYorkPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    public NewYorkPizza(Builder builder) {
        super(builder);
        this.size = builder.size;
    }
}
