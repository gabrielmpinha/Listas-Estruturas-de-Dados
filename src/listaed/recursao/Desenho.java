package listaed.recursao;

public class Desenho {

    private static String imagem = "";
    private static int contadorAst = 0;
    private static int contadorEsp = 0;

    public static String draw(int imageSize, int numberOfAsterisk, int numberOfSpaces) {

        if(imagem.length() == ((imageSize+1)*(imageSize)))
            return imagem;

        else{

            if(imagem.length() % (imageSize+1) == 0 || (imagem.length()+2) % (imageSize+1) == 0) {
                imagem += '|';
            }

            else if((imagem.length()+1) % (imageSize+1) == 0)
                imagem += '\n';

            else if(contadorAst < numberOfAsterisk){
                imagem += '*';

                if(numberOfSpaces != 0) {
                    contadorAst++;
                    if (contadorAst == numberOfAsterisk)
                        contadorEsp = 0;
                }

            }

            else if(contadorEsp < numberOfSpaces ) {
                imagem += ' ';

                if(numberOfAsterisk != 0) {
                    contadorEsp++;
                    if (contadorEsp == numberOfSpaces)
                        contadorAst = 0;
                }
            }

            return draw(imageSize, numberOfAsterisk, numberOfSpaces);
        }


    }

}
