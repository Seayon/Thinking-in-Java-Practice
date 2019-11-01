package com.seayon.chapter19;

public enum Shrubbery {
    GROUND {
        @Override
        String getInfo() {
            return "GROUND";
        }
    }, CRAWLING {
        @Override
        String getInfo() {
            return null;
        }
    }, HANGING {
        @Override
        String getInfo() {
            return null;
        }
    };

    abstract String getInfo();
}
