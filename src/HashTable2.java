public class HashTable2 {
    LinkedList2[] Table2;


    HashTable2(int s) {

        int size = s + (s / 3);
        int newSize = getPrime(size);

        Table2 = new LinkedList2[newSize];
        for (int i = 0; i < newSize; i++) {
            Table2[i] = new LinkedList2();
        }
    }

    private int getPrime(int n) {
        while (true) {
            if (isPrime(n)) return n;
            n++;
        }
    }

    private boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public int Initial_Hash(Node key) {
        String x = key.DISTRICT;
        int i = 0;
        //KP
        //kp finish
        //Punjab
        //punjab finish
        //SIndh
        switch (key.Province) {
            case "Balochistan" -> {
                switch (x) {
                    case "AWARAN DISTRICT" -> i = 0;
                    case "BARKHAN DISTRICT" -> i = 1;
                    case "CHAGAI DISTRICT" -> i = 2;
                    case "DERA BUGTI DISTRICT" -> i = 3;
                    case "GWADAR DISTRICT" -> i = 4;
                    case "HARNAI DISTRICT" -> i = 5;
                    case "JAFFARABAD DISTRICT" -> i = 6;
                    case "JHAL MAGSI DISTRICT" -> i = 7;
                    case "KACHHI DISTRICT" -> i = 8;
                    case "KALAT DISTRICT" -> i = 9;
                    case "KECH DISTRICT" -> i = 10;
                    case "KHARAN DISTRICT" -> i = 11;
                    case "KHUZDAR DISTRICT" -> i = 12;
                    case "KILLA ABDULLAH DISTRICT" -> i = 13;
                    case "KILLA SAIFULLAH DISTRICT" -> i = 14;
                    case "KOHLU DISTRICT" -> i = 15;
                    case "LASBELA DISTRICT" -> i = 16;
                    case "LEHRI DISTRICT" -> i = 17;
                    case "LORALAI DISTRICT" -> i = 18;
                    case "MASTUNG DISTRICT" -> i = 19;
                    case "MUSAKHEL DISTRICT" -> i = 20;
                    case "NASIRABAD DISTRICT" -> i = 21;
                    case "NUSHKI DISTRICT" -> i = 22;
                    case "PANJGUR DISTRICT" -> i = 23;
                    case "PISHIN DISTRICT" -> i = 24;
                    case "QUETTA DISTRICT" -> i = 25;
                    case "SIBI DISTRICT" -> i = 26;
                    case "SOHBATPUR DISTRICT" -> i = 26;
                    case "WASHUK DISTRICT" -> i = 27;
                    case "ZHOB DISTRICT" -> i = 28;
                    case "ZIARAT DISTRICT" -> i = 29;
                    case "SHERANI DISTRICT" -> i = 30;
                }
                return i % 31;
            }
            case "KP" -> {
                i = switch (x) {
                    case "ABBOTTABAD DISTRICT" -> 0;
                    case "BANNU DISTRICT" -> 1;
                    case "CHITRAL DISTRICT" -> 2;
                    case "CHARSADDA DISTRICT" -> 3;
                    case "DERA ISMAIL KHAN DISTRICT" -> 4;
                    case "HANGU DISTRICT" -> 5;
                    case "HARIPUR DISTRICT" -> 6;
                    case "KARAK DISTRICT" -> 7;
                    case "KOHAT DISTRICT" -> 8;
                    case "LAKKI MARWAT DISTRICT" -> 9;
                    case "LOWER DIR DISTRICT" -> 10;
                    case "MALAKAND PROTECTED AREA" -> 11;
                    case "MANSEHRA DISTRICT" -> 12;
                    case "MARDAN DISTRICT" -> 13;
                    case "NOWSHERA DISTRICT" -> 14;
                    case "PESHAWAR DISTRICT" -> 15;
                    case "SWABI DISTRICT" -> 16;
                    case "SWAT DISTRICT" -> 17;
                    case "TANK DISTRICT" -> 18;
                    case "UPPER DIR DISTRICT" -> 19;
                    case "BATAGRAM DISTRICT" -> 20;
                    case "BUNER DISTRICT" -> 21;
                    case "KOHISTAN DISTRICT" -> 22;
                    case "SHANGLA DISTRICT" -> 23;
                    case "TORGHAR DISTRICT" -> 24;
                    default -> i;
                };
                return i % 25;
            }
            case "Punjab" -> {
                i = switch (x) {
                    case "ATTOCK DISTRICT" -> 0;
                    case "BAHAWALNAGAR DISTRICT" -> 1;
                    case "BAHAWALPUR DISTRICT" -> 2;
                    case "BHAKKAR DISTRICT" -> 3;
                    case "CHAKWAL DISTRICT" -> 4;
                    case "CHINIOT DISTRICT" -> 5;
                    case "DERA GHAZI KHAN DISTRICT" -> 6;
                    case "FAISALABAD DISTRICT" -> 7;
                    case "GUJRANWALA DISTRICT" -> 8;
                    case "GUJRAT DISTRICT" -> 9;
                    case "HAFIZABAD DISTRICT" -> 10;
                    case "ISLAMABAD DISTRICT" -> 11;
                    case "JHANG DISTRICT" -> 12;
                    case "JHELUM DISTRICT" -> 13;
                    case "KASUR DISTRICT" -> 14;
                    case "KHANEWAL DISTRICT" -> 15;
                    case "KHUSHAB DISTRICT" -> 16;
                    case "LAHORE DISTRICT" -> 17;
                    case "LAYYAH DISTRICT" -> 18;
                    case "LODHRAN DISTRICT" -> 19;
                    case "MANDI BAHAUDDIN DISTRICT" -> 20;
                    case "MIANWALI DISTRICT" -> 21;
                    case "MULTAN DISTRICT" -> 22;
                    case "MUZAFFARGARH DISTRICT" -> 23;
                    case "NANKANA SAHIB DISTRICT" -> 24;
                    case "NAROWAL DISTRICT" -> 25;
                    case "OKARA DISTRICT" -> 26;
                    case "PAKPATTAN DISTRICT" -> 27;
                    case "RAHIM YAR KHAN DISTRICT" -> 28;
                    case "RAJANPUR DISTRICT" -> 29;
                    case "RAWALPINDI DISTRICT" -> 30;
                    case "SAHIWAL DISTRICT" -> 31;
                    case "SARGODHA DISTRICT" -> 32;
                    case "SHEIKHUPURA DISTRICT" -> 33;
                    case "SIALKOT DISTRICT" -> 34;
                    case "Badin" -> 35;
                    case "TOBA TEK SINGH DISTRICT" -> 36;
                    case "VEHARI DISTRICT" -> 37;
                    default -> i;
                };
                return i % 38;
            }
            case "Sindh" -> {
                i = switch (x) {
                    case "BADIN DISTRICT" -> 0;
                    case "DADU DISTRICT" -> 1;
                    case "GHOTKI DISTRICT" -> 2;
                    case "HYDERABAD DISTRICT" -> 3;
                    case "JACOBABAD DISTRICT" -> 4;
                    case "JAMSHORO DISTRICT" -> 5;
                    case "KAMBAR SHAHDAD KOT DISTRICT" -> 6;
                    case "KARACHI DISTRICT" -> 7;
                    case "KASHMOR DISTRICT" -> 8;
                    case "KHAIRPUR DISTRICT" -> 9;
                    case "LARKANA DISTRICT" -> 10;
                    case "MATIARI DISTRICT" -> 11;
                    case "MIRPUR KHAS DISTRICT" -> 12;
                    case "NAUSHAHRO FEROZE DISTRICT" -> 13;
                    case "SANGHAR DISTRICT" -> 14;
                    case "SHAHEED BENAZIRABAD DISTRICT" -> 15;
                    case "SHIKARPUR DISTRICT" -> 16;
                    case "SUJAWAL DISTRICT" -> 17;
                    case "SUKKUR DISTRICT" -> 18;
                    case "TANDO ALLAHYAR DISTRICT" -> 19;
                    case "TANDO MUHAMMAD KHAN DISTRICT" -> 20;
                    case "THARPARKAR DISTRICT" -> 21;
                    case "THATTA DISTRICT" -> 22;
                    case "UMER KOT DISTRICT" -> 23;
                    default -> i;
                };
                return i % 24;
            }
            case "FATA" -> {
                i = switch (x) {
                    case "BAJAUR AGENCY" -> 0;
                    case "FR D.I.KHAN" -> 1;
                    case "FR KOHAT" -> 2;
                    case "FR LAKKI MARWAT" -> 3;
                    case "FR PESHAWAR" -> 4;
                    case "FR TANK" -> 5;
                    case "KHYBER AGENCY" -> 6;
                    case "KURRAM AGENCY" -> 7;
                    case "NORTH WAZIRISTAN AGENCY" -> 8;
                    case "MOHMAND AGENCY" -> 9;
                    case "ORAKZAI AGENCY" -> 10;
                    case "SOUTH WAZIRISTAN AGENCY" -> 11;
                    default -> i;
                };
                return i % 12;
            }
        }
        return -1;
    }


    public int Initial_Hash(String key, String P) {
        String x = key;
        int i = -1;
        if (P.equals("Balochistan")) {
            switch (x) {
                case "AWARAN DISTRICT" -> i = 0;
                case "BARKHAN DISTRICT" -> i = 1;
                case "CHAGAI DISTRICT" -> i = 2;
                case "DERA BUGTI DISTRICT" -> i = 3;
                case "GWADAR DISTRICT" -> i = 4;
                case "HARNAI DISTRICT" -> i = 5;
                case "JAFFARABAD DISTRICT" -> i = 6;
                case "JHAL MAGSI DISTRICT" -> i = 7;
                case "KACHHI DISTRICT" -> i = 8;
                case "KALAT DISTRICT" -> i = 9;
                case "KECH DISTRICT" -> i = 10;
                case "KHARAN DISTRICT" -> i = 11;
                case "KHUZDAR DISTRICT" -> i = 12;
                case "KILLA ABDULLAH DISTRICT" -> i = 13;
                case "KILLA SAIFULLAH DISTRICT" -> i = 14;
                case "KOHLU DISTRICT" -> i = 15;
                case "LASBELA DISTRICT" -> i = 16;
                case "LEHRI DISTRICT" -> i = 17;
                case "LORALAI DISTRICT" -> i = 18;
                case "MASTUNG DISTRICT" -> i = 19;
                case "MUSAKHEL DISTRICT" -> i = 20;
                case "NASIRABAD DISTRICT" -> i = 21;
                case "NUSHKI DISTRICT" -> i = 22;
                case "PANJGUR DISTRICT" -> i = 23;
                case "PISHIN DISTRICT" -> i = 24;
                case "QUETTA DISTRICT" -> i = 25;
                case "SIBI DISTRICT" -> i = 26;
                case "SOHBATPUR DISTRICT" -> i = 26;
                case "WASHUK DISTRICT" -> i = 27;
                case "ZHOB DISTRICT" -> i = 28;
                case "ZIARAT DISTRICT" -> i = 29;
                case "SHERANI DISTRICT" -> i = 30;
            }
            return i % 31;
        } else if (P.equals("KP")) {
            //KP
            i = switch (x) {
                case "ABBOTTABAD DISTRICT" -> 0;
                case "BANNU DISTRICT" -> 1;
                case "CHITRAL DISTRICT" -> 2;
                case "CHARSADDA DISTRICT" -> 3;
                case "DERA ISMAIL KHAN DISTRICT" -> 4;
                case "HANGU DISTRICT" -> 5;
                case "HARIPUR DISTRICT" -> 6;
                case "KARAK DISTRICT" -> 7;
                case "KOHAT DISTRICT" -> 8;
                case "LAKKI MARWAT DISTRICT" -> 9;
                case "LOWER DIR DISTRICT" -> 10;
                case "MALAKAND PROTECTED AREA" -> 11;
                case "MANSEHRA DISTRICT" -> 12;
                case "MARDAN DISTRICT" -> 13;
                case "NOWSHERA DISTRICT" -> 14;
                case "PESHAWAR DISTRICT" -> 15;
                case "SWABI DISTRICT" -> 16;
                case "SWAT DISTRICT" -> 17;
                case "TANK DISTRICT" -> 18;
                case "UPPER DIR DISTRICT" -> 19;
                case "BATAGRAM DISTRICT" -> 20;
                case "BUNER DISTRICT" -> 21;
                case "KOHISTAN DISTRICT" -> 22;
                case "SHANGLA DISTRICT" -> 23;
                case "TORGHAR DISTRICT" -> 24;
                default -> i;
            };
            return i % 25;
        }
        //kp finish
        //Punjab
        else if (P.equals("Punjab")) {
            i = switch (x) {
                case "ATTOCK DISTRICT" -> 0;
                case "BAHAWALNAGAR DISTRICT" -> 1;
                case "BAHAWALPUR DISTRICT" -> 2;
                case "BHAKKAR DISTRICT" -> 3;
                case "CHAKWAL DISTRICT" -> 4;
                case "CHINIOT DISTRICT" -> 5;
                case "DERA GHAZI KHAN DISTRICT" -> 6;
                case "FAISALABAD DISTRICT" -> 7;
                case "GUJRANWALA DISTRICT" -> 8;
                case "GUJRAT DISTRICT" -> 9;
                case "HAFIZABAD DISTRICT" -> 10;
                case "ISLAMABAD DISTRICT" -> 11;
                case "JHANG DISTRICT" -> 12;
                case "JHELUM DISTRICT" -> 13;
                case "KASUR DISTRICT" -> 14;
                case "KHANEWAL DISTRICT" -> 15;
                case "KHUSHAB DISTRICT" -> 16;
                case "LAHORE DISTRICT" -> 17;
                case "LAYYAH DISTRICT" -> 18;
                case "LODHRAN DISTRICT" -> 19;
                case "MANDI BAHAUDDIN DISTRICT" -> 20;
                case "MIANWALI DISTRICT" -> 21;
                case "MULTAN DISTRICT" -> 22;
                case "MUZAFFARGARH DISTRICT" -> 23;
                case "NANKANA SAHIB DISTRICT" -> 24;
                case "NAROWAL DISTRICT" -> 25;
                case "OKARA DISTRICT" -> 26;
                case "PAKPATTAN DISTRICT" -> 27;
                case "RAHIM YAR KHAN DISTRICT" -> 28;
                case "RAJANPUR DISTRICT" -> 29;
                case "RAWALPINDI DISTRICT" -> 30;
                case "SAHIWAL DISTRICT" -> 31;
                case "SARGODHA DISTRICT" -> 32;
                case "SHEIKHUPURA DISTRICT" -> 33;
                case "SIALKOT DISTRICT" -> 34;
                case "Badin" -> 35;
                case "TOBA TEK SINGH DISTRICT" -> 36;
                case "VEHARI DISTRICT" -> 37;
                default -> i;
            };
            return i % 38;
        } else if (P.equals("Sindh")) {
            //punjab finish
            //SIndh
            i = switch (x) {
                case "BADIN DISTRICT" -> 0;
                case "DADU DISTRICT" -> 1;
                case "GHOTKI DISTRICT" -> 2;
                case "HYDERABAD DISTRICT" -> 3;
                case "JACOBABAD DISTRICT" -> 4;
                case "JAMSHORO DISTRICT" -> 5;
                case "KAMBAR SHAHDAD KOT DISTRICT" -> 6;
                case "KARACHI DISTRICT" -> 7;
                case "KASHMOR DISTRICT" -> 8;
                case "KHAIRPUR DISTRICT" -> 9;
                case "LARKANA DISTRICT" -> 10;
                case "MATIARI DISTRICT" -> 11;
                case "MIRPUR KHAS DISTRICT" -> 12;
                case "NAUSHAHRO FEROZE DISTRICT" -> 13;
                case "SANGHAR DISTRICT" -> 14;
                case "SHAHEED BENAZIRABAD DISTRICT" -> 15;
                case "SHIKARPUR DISTRICT" -> 16;
                case "SUJAWAL DISTRICT" -> 17;
                case "SUKKUR DISTRICT" -> 18;
                case "TANDO ALLAHYAR DISTRICT" -> 19;
                case "TANDO MUHAMMAD KHAN DISTRICT" -> 20;
                case "THARPARKAR DISTRICT" -> 21;
                case "THATTA DISTRICT" -> 22;
                case "UMER KOT DISTRICT" -> 23;
                default -> i;
            };
            return i % 24;
        } else if (P.equals("FATA")) {
            i = switch (x) {
                case "BAJAUR AGENCY" -> 0;
                case "FR D.I.KHAN" -> 1;
                case "FR KOHAT" -> 2;
                case "FR LAKKI MARWAT" -> 3;
                case "FR PESHAWAR" -> 4;
                case "FR TANK" -> 5;
                case "KHYBER AGENCY" -> 6;
                case "KURRAM AGENCY" -> 7;
                case "NORTH WAZIRISTAN AGENCY" -> 8;
                case "MOHMAND AGENCY" -> 9;
                case "ORAKZAI AGENCY" -> 10;
                case "SOUTH WAZIRISTAN AGENCY" -> 11;
                default -> i;
            };
            return i % 12;
        }
        return -11;
    }


    public Node[] search (String value, String P){

        int x = Initial_Hash(value, P);
        return Table2[x].returnData();
    }

    public void insert (Node key){
        int i = Initial_Hash(key);
        Table2[i].insert(key);
    }

    public String toString () {
        String str = "";
        for (int i = 0; i < Table2.length; i++) {
            str = str + "[" + i + "]" + Table2[i] + "\n";
        }
        return str;
    }
}
