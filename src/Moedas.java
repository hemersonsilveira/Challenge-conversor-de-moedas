public class Moedas {
    private String result;
    private String base_code;
    private ConversionRates conversion_rates;

    public String getResult() {
        return result;
    }

    public String getBase_code() {
        return base_code;
    }

    public ConversionRates getConversion_rates() {
        return conversion_rates;
    }

    public static class ConversionRates {
        private double USD;
        private double BRL;
        private double ARS;
        private double COP;

        public double getUSD() {
            return USD;
        }

        public double getBRL() {
            return BRL;
        }

        public double getARS() {
            return ARS;
        }

        public double getCOP() {
            return COP;
        }
    }
}
