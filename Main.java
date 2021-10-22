class Main {
    public static void main(String[] args) {
      Heroes hero = new Heroes();
  
      hero.setProfile("Jusri", 22, 150);
      hero.profile();
      
  
      // jalankan aktivitas disini...
      hero.jalan();
      hero.jalan();
      hero.jalan();
  
      hero.lari();

      hero.makan();
      hero.makan();
      hero.makan();
      hero.makan();
      hero.makan();

      hero.minum();

      hero.lompat();
      hero.lompat();
      hero.lompat();
      hero.lompat();
      hero.lompat();

      hero.duduk();
      hero.duduk();
      hero.duduk();
      
      // tampilkan status terkini...
      hero.profile();
      
    }
  }