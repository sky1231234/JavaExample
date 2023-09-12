public enum Country {
    KOREA{
        public void print(){
            System.out.println("대한민국");
        }
    },
    USA{
        @Override
        public void print() {
            System.out.println("미국");
        }
    };

    public abstract void print();
}
