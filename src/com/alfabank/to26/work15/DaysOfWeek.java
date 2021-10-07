package com.alfabank.to26.work15;

enum DaysOfWeek {
    MONDAY{
        public void nextDay(){
            System.out.println("MONDAY \nThe next day of week: TUESDAY");
        }
    },
    TUESDAY{
        public void nextDay(){
            System.out.println("TUESDAY \nThe next day of week: WEDNESDAY");
        }
    },
    WEDNESDAY{
        public void nextDay(){
            System.out.println("WEDNESDAY \nThe next day of week: THURSDAY");
        }
    },
    THURSDAY{
        public void nextDay(){
            System.out.println("THURSDAY \nThe next day of week: FRIDAY");
        }
    },
    FRIDAY{
        public void nextDay(){
            System.out.println("FRIDAY \nThe next day of week: SATURDAY");
        }
    },
    SATURDAY{
        public void nextDay(){
            System.out.println("SATURDAY \nThe next day of week: SUNDAY");
        }
    },
    SUNDAY{
        public void nextDay(){
            System.out.println("SUNDAY \nThe next day of week: MONDAY");
        }
    };

    public abstract void nextDay();
}
