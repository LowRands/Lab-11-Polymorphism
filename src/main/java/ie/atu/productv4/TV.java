package ie.atu.productv4;

public class TV extends Product {

        private String Manufacturer;
        private int Size;

        public TV() {
            super();
            Manufacturer = "";
            Size = 0;
            count++;
        }

        public void setManufacturer(String Manufacturer) {
            this.Manufacturer = Manufacturer;
        }

        public String getManufacturer() {
            return Manufacturer;
        }
        public void setSize(int Size) {
            this.Size = Size;
        }
        public int getSize() {
            return Size;
        }

        @Override
        public String toString() {
            return super.toString() + " by " + Manufacturer + "\nScreen size is " + Size + "'";
        }
    }
