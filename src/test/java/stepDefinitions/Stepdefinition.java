package stepDefinitions;

import io.cucumber.java.en.Given;
import utilities.JDBCReusableMethods;

public class Stepdefinition {

    @Given("Database baglantisi kurulur")
    public void database_baglantisi_kurulur() {
        JDBCReusableMethods.createConnection();
    }
    @Given("Query hazirlanir")
    public void query_hazirlanir() {
        String query = "";
    }
    @Given("Query calistirilir ve sonuclari alinir")
    public void query_calistirilir_ve_sonuclari_alinir() {

    }
    @Given("Query sonuclari dogrulanir")
    public void query_sonuclari_dogrulanir() {

    }
    @Given("Database baglantisi kapatilir")
    public void database_baglantisi_kapatilir() {

    }

}
/*
git init
git add .
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/mehmetfilik/CucumberJDBCTeam113.git
git push -u origin main
 */