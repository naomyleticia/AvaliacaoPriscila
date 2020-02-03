package br.edu.ifal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * TrianguloTest
 */
public class TrianguloTest {

    Triangulo triangulo;

    @Before
    public void inicializacao() {
        
    }

    @Test
    public void deveRetornarIlegalParaLadosIguaisAZero() {
        triangulo = new Triangulo(0, 0, 0);
        String valorRetornado = triangulo.getTipo(triangulo);
        String valorEsperado = "Ilegal";
        assertEquals(valorEsperado, valorRetornado);
    }
    
    @Test
    public void deveRetornarIlegalQuandoUmDosLadosForIgualAZero() {
        triangulo = new Triangulo(10, 0, 8);
        String valorRetornado = triangulo.getTipo(triangulo);
        String valorEsperado = "Ilegal";
        assertEquals(valorEsperado, valorRetornado);
    }

    @Test
    public void deveRetornarIlegalQuandoDoisLadosForemIguaisAZero() {
        triangulo = new Triangulo(10, 0, 0);
        String valorRetornado = triangulo.getTipo(triangulo);
        String valorEsperado = "Ilegal";
        assertEquals(valorEsperado, valorRetornado);
    }
    
    @Test
    public void deveRetornarIlegalQuandoASubtracaoDoLadoUmComOLadoTresForIgualAoValorDoLadoDois() {
        triangulo = new Triangulo(10, 8, 2);
        String valorRetornado = triangulo.getTipo(triangulo);
        String valorEsperado = "Ilegal";
        assertEquals(valorEsperado, valorRetornado);
    }

    @Test
    public void deveRetornarIlegalQuandoASubtracaoDoLadoDoisComOLadoTresForMenorQueOValorDoLadoUm(){
        triangulo = new Triangulo(5, 8, 2);
        String valorRetornado = triangulo.getTipo(triangulo);
        String valorEsperado = "Ilegal";
        assertEquals(valorEsperado, valorRetornado);
    }
    

    @Test
    public void deveRetornarIlegalQuandoASubtracaoDoLadoDoisComOLadoUmForMenorQueOValorDoLadoTres(){
        triangulo = new Triangulo(2, 4, 1);
        String valorRetornado = triangulo.getTipo(triangulo);
        String valorEsperado = "Ilegal";
        assertEquals(valorEsperado, valorRetornado);
    }

    @Test
    public void deveRetornarIlegalQuandoASubtracaoDoLadoTresComOLadoUmForMenorQueOValorDoLadoDois(){
        triangulo = new Triangulo(6, 2, 9);
        String valorRetornado = triangulo.getTipo(triangulo);
        String valorEsperado = "Ilegal";
        assertEquals(valorEsperado, valorRetornado);
    }

    @Test
    public void deveRetornarEscalenoParaTodosOsLadosDiferentes() {
        triangulo = new Triangulo(2, 4, 5);
        String valorRetornado = triangulo.getTipo(triangulo);
        String valorEsperado = "Escaleno";
        assertEquals(valorEsperado, valorRetornado);
    }

    @Test
    public void deveRetornarEquilateroParaTodosOsLadosIguais() {
        triangulo = new Triangulo(2, 2, 2);
        String valorRetornado = triangulo.getTipo(triangulo);
        String valorEsperado = "Equilatero";
        assertEquals(valorEsperado, valorRetornado);

    }

    @Test
    public void deveRetornarIsoscelesQuandoOValorDoVetorDoisForIgualDoVetorTres() {
        triangulo = new Triangulo(2, 6, 6);
        String valorRetornado = triangulo.getTipo(triangulo);
        String valorEsperado = "Isosceles";
        assertEquals(valorEsperado, valorRetornado);

    }

    @Test
    public void deveRetornarIsoscelesQuandoOValorDoVetorUmForIgualADoVetorDois() {
        triangulo = new Triangulo(4, 4, 1);
        String valorRetornado = triangulo.getTipo(triangulo);
        String valorEsperado = "Isosceles";
        assertEquals(valorEsperado, valorRetornado);
    }
    @Test
    public void deveRetornarIsoscelesQuandoOValorDoVetorUmForIgualADoVetorTres() {
        triangulo = new Triangulo(5, 4, 5);
        String valorRetornado = triangulo.getTipo(triangulo);
        String valorEsperado = "Isosceles";
        assertEquals(valorEsperado, valorRetornado);
    }
 

}