package com.example.prove_varie.Classi.UnitTest;

//Come fare il test di una classe:

// Creare il la classe Test di una classe esistente
// 1.  Creare una cartella "test" allo stesso livello della cartella "main"
// 2.  Dentro questa si trova la cartella "java", dentro quest'ultima creare una cartella "junit"
// 3.  Nella classe in cui vogliamo testare un metodo mettere il cursore sul nome della classe scelta, "testClass" in questo caso,
// 4.  e premere: "Alr + Invio" -> "Create test" e scegliere come package di destinazione la cartella "junit" in "test"
// 5.  Si creerà una classe con nome: "classe_da_testare'Test'"  Es: se la classe da testare è: "testClass" la classe che si andrà a
//     a creare si chiamerà: "testClass" + "Test" e quindi il suo nome sarà: "testClassTest"

// Aggiungere il test
// 1.  Scelgo il metodo per cui voglio fare il test
// 2.  Nella classe del test creo un metodo (public void?) con un nome tipo: "test 'nome metodo da testare" es: "testSomma"
// 3.  Nella classe del test scrivo "@Test" sopra il metodo che testa Es:  " @Test '\n testSomma(..){...}"
// 4.  Nel metodo della classe Test inizializzo uno nuova variabile del tipo della classe da testare stessa:
//     In questo caso la classe da testare è "testClass", creo una nuova istanza di tipo "testClass"
//     Il nome dell'istanza sarà " 'Test' + 'Nome_metodo_da_testare' ": Se voglio testare la funzione 'Somma' sarà:
//     Nome istanza: "TestSomma" (= new 'Classe che contiene il metodo somma da testare') = new testClass
//     In generale scriveremo:  testCLass TestSomma = new testClass()
// 5.  Successivamente eseguiremo delle operazioni di test confrontando i risultati ottenuti dal metodo da testare sull'istanza
//     della classe che contiene tale metodo e dei risultati desiderati da noi tramite le operazioni di tipo Asserts

//  Alcune operazioni di tipo Asserts:
//  Tutti i seguenti metodi sono "static void" scriveremo solo il nome e i parametri
//
//  1.  assertEquals(boolean expected, boolean actual)
//  2.  assertEquals(byte expected, byte actual)
//  3.  assertEquals(char expected, char actual)
//  4.  assertEquals(double expected, double actual, double delta)      //delta indica la tolleranza di approssimazione tra i due risultati
//  5.  assertEquals(float expected, float actual, float delta)
//  6.  assertEquals(int expected, int actual)


public class testClass {

    public int Somma(int a, int b) {
        int result;
        result = a + b;
        return (result);
    }

    public double Divisione(int a, int b) {
        double result;
        result = a / b;
        return (result);
    }




}
