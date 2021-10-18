package com.codecool.wasterecycling;

public class PaperGarbage extends Garbage {
        protected boolean isSqueezed;

        public PaperGarbage(String garbageName, boolean isSqueezed) {
                super(garbageName);
                this.isSqueezed = isSqueezed;
        }

        public boolean isSqueezed() {
                return isSqueezed;
        }

        public void squeeze() {
                if (!isSqueezed) {
                        isSqueezed = true;
                        System.out.println("The " + this.getName() + " was squeezed!");
                }
        }
}
