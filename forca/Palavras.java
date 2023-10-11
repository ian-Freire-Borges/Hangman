
package com.mycompany.forca;

import java.text.Normalizer;

public class Palavras {
   String palavrasN[];
   String palavrasBrutasv[];

    public void  criapalavras(){
    String palavrasBrutas = "Abacate Abacaxi Abóbora Abolição Abraço Abrigo Ação Açúcar Adeus Admiração Adolescente Aeroporto Agulha Agricultura Água Águia Alegria Alho"
            + " Almofada Amigo Amor Aniversário Anjo Animal Anoitecer Antigo Aplicativo  Arroz Arte Asas Astronomia Aventura Aviso Bailarina Balão Banana"
            + " Barco Bebida Beijo Beleza Biblioteca Bicicleta Bolo Borboleta Brilho Cachorro Cadeira Caixa Câmera Canção Canela Canto Carinho Carro Casa Castelo "
            + "Céu Chocolate Chuva Cidade Coelho Colina Computador Concha Coração Coragem Coruja Cozinha Criança Dança Desejo Deserto Dia Diamante Diversão Doces "
            + "Dormir Dragão Elegância Elefante Emoção Encanto Escola Esporte Estrela Fada Família Fantasia Felicidade Festa Flores Formatura Fotografia Frio Fruta "
            + "Futebol Gato Girassol Gota Gravidade Guitarra Harmonia Herança História Ilha Imaginação Infância Inverno Jardim Jogo Joia Jornal Lágrima Laranja "
            + "Leitura Leveza Liberdade Lua Luminária Mágica Mãos Mar Música Melodia Menina Menino Mistério Montanha Mundo Natureza Noite Nota Novidade Oceano "
            + "Olhos Orquídea Palavra Paisagem Pássaro Paz Pintura Poesia Presente Primavera Profundidade Promessa Queijo Raio Riso Romance Sabedoria "
            + "Sabor Saudade Segredo Silêncio Sintonia Sombra Sorriso Sonho Surpresa Ternura Tesouro Tristeza Universo Utopia Vento Verdade Viagem Vida Vinho "
            + "Violino Vitória Zoológico Abóbora Abraço Acampamento Acessório Adestramento Adivinha Aeronave Afeto Agenda Agressão Álbum Alfabeto Alimentação "
            + "Aluguel Ambição Amuleto Ancião Anel Anseio Antiguidade Aparência Aquarela Arco Arena Argila Arrependimento Arriscar Artista Atriz Avanço Avental"
            + " Aviso Beleza Biblioteca Bilhete Bolha Bravura Brigadeiro Brinquedo Brisa Cabelo Cadeira Caixa Caminho Cantina Caramelo Carícia Castigo Celebrar"
            + " Cenário Cesta Charme Chave Cidade Cigarro Circo Coelhinho Colar Comédia Comida Companheiro Conquista Coração Coragem Corrida Coruja Crença Cristal"
            + " Cultura Dançarina Declaração Degustar Desejo Destino Detalhe Diamante Diferença Dinheiro Direção Doce Dormir Drama Ecosistema Educação Efeito"
            + " Elegância Emoção Encanto Encontro Energia Enigma Ensinar Entardecer Equilíbrio Esperança Espetáculo Estrela Experiência Família Fantasia"
            + " Felicidade Feriado Festa Ficção Floresta Formatura Fotografia Fruta Futebol Gaivota Gargalhada Gentileza Gravidade Guitarra Harmonia Herança"
            + " História Imaginação Inocência Inspiração Intuição Janela Jardim Joia Jornada Labirinto Lanche Leitura Liberdade Luz Magia Manhã Maravilha"
            + " Maturidade Medo Melodia Memória Milagre Momento Montanha Movimento Música Natureza Navegação Nuvem Onda Paixão Pássaro Pintura Poesia "
            + "Praia Presente Profundidade Promessa Raio Recordação Reflexo Romance Sabor Sabedoria Segredo Serenidade Silêncio Simplicidade Sintonia Solidão "
            + "Sorriso Sonho Superação Ternura Tesouro Tradição Tristeza Universo Utopia Valente Variedade Vida Vinho Violino Vitória Zoológico Abóbora Abraço "
            + "Acampamento Acessório Adestramento Adivinha Aeronave Afeto Agenda Agressão Álbum Alfabeto Alimentação Aluguel Ambição Amuleto Ancião Anel Anseio "
            + "Antiguidade Aparência Aquarela Arco Arena Argila Arrependimento Arriscar Artista Atriz Avanço Avental Aviso Beleza Biblioteca Bilhete Bolha "
            + "Bravura Brigadeiro Brinquedo Brisa Cabelo Cadeira Caixa Caminho Cantina Caramelo Carícia Castigo Celebrar Cenário Cesta Charme Chave Cidade "
            + "Cigarro Circo Coelhinho Colar Comédia Comida Companheiro Conquista Coração Coragem Corrida Coruja Crença Cristal Cultura Dançarina Declaração "
            + "Degustar Desejo Destino Detalhe Diamante Diferença Dinheiro Direção Doce Dormir Drama Ecosistema Educação Efeito Elegância Emoção Encanto "
            + "Encontro Energia Enigma Ensinar Entardecer Equilíbrio Esperança Espetáculo Estrela Experiência Família Fantasia Felicidade Feriado Festa "
            + "Ficção Floresta Formatura Fotografia Fruta Futebol Gaivota Gargalhada Gentileza Gravidade Guitarra Harmonia Herança História Imaginação "
            + "Inocência Inspiração Intuição Janela Jardim Joia Jornada "
            + "Labirinto Lanche Leitura Liberdade Luz Magia Manhã Maravilha Maturidade Medo Melodia Memória Milagre Momento Montanha Movimento Música Natureza "
            + "Navegação Nuvem Onda Paixão Pássaro Pintura Poesia  Praia Presente Profundidade Promessa Raio Recordação Reflexo Romance Sabor Sabedoria"
            + " Segredo Serenidade Silêncio Simplicidade Sintonia Solidão Sorriso Sonho Superação Ternura Tesouro Tradição Tristeza Universo Utopia Valente "
            + "Variedade Vida Vinho Violino Vitória Zoológico";
    String palavraNormalizada = palavrasBrutas.toUpperCase();
    palavraNormalizada = Normalizer.normalize(palavraNormalizada, Normalizer.Form.NFD);
    palavraNormalizada = palavraNormalizada.replaceAll("[^\\p{ASCII}]", "");
    palavrasN = palavraNormalizada.split(" ");
    palavrasBrutasv = palavrasBrutas.split(" ");
    
 
    }
    

}
