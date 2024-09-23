# PrimitiveWriteChars
## Enunciado:

exercicio 5
primitivewritechars

Neste exercicio seguiremos tratando os fluxos binarios de datos pero agora tratandoos como soporte de tipos de datos primitivos e valores String

DataInputStream dispon dunha serie de  métodos  para que partindo  de fluxos binaros de datos  podamos ler tipos primitivos de datos e valores String

DataOutputStream dispon dunha serie de  métodos  para que partindo  de fluxos binaros de datos  podamos escribir tipos primitivos de datos e valores String que previamente foron codificados nestes fluxos mediante DataInputStream

Dado que DataInputStream admite como parametro calquer clase herdada de InputStream , e BufferedInputStream cumpre este requisito,  o único que temos que facer para poder usar os metodos de DataInputStream e pasarlle como parmaetro un obxecto BufferedInputStream coma o traballado no exercicio anterior (exercicio 3)

Dado que DataOutputStream admite como parametro calquer clase herdada de OutputStream , e BufferedOutputStream cumpre este requisito o único que temos que facer para poder usar os metodos de DataOutputStream e pasarlle como parmaetro un obxecto BufferedOutputStream coma o traballado no exercicio anterior (exercicio 3)

APLICACION

Propoñovos un exercicio que consistirá grabar unha mesma cadea  de texto duas veces usando o metodo  writeChars(String) da clase DataOutputStream  nun ficheiro denominado text5.dat para posteriormente recuperalas (voltalas a ler) mediante o metodo readChar() da clase DataInputStream .

Ter en cota que writeChars(String) escribe 2 bytes por caracter  (podemos cambiar calquera vogal da cadea por esa mesma vogal acentuada ou unha letra ñ e veremos que a lonxitude da cadea non varia (ao contrario do que ocorria con writeUTF() onde si variaba)

Ter en cota que readChar() lé un caracter de cada vez co cal haberá que facer un bucle que  execute esta instruccion tantas veces como letras ten a cadea que que quermos ler

cadea a grabar : "o tempo está xélido"

metodos a usar :

metodo length()  -- aplicado a calquera String danos a sua lonxitude en numero de caracteres.

clase DataInputStream:
metodo readChar() -- lee un caracter de cada vez (2 bytes)
metodo .available() --dinos cantos bytes quedan por ler dun ficheiro

clase DataOutputStream:
metodo writeChars(String) -- escribe o String (ocupa 2 bytes por caracter)
metodo size() aplicado a un obxecto de tipo DataOutputStream devolvenos o que ocupa este en bytes


nota: dado que grabamos duas cadeas de igual lonxitude , para lelas debemos repetir o codigo correspondente a una lectura duas veces, ou facer un bucle ata que o contido a ler (detectable co metodo available() da clase DataInputStream  sexa de una lonxitude igual a 0


o resultado da execucion debería ser o seguinte:



escribindo  : o tempo está xélido
a lonxitude desta cadea en carateres e: 19 caracteres
levanse escritos:  38 bytes
escribindo  : o tempo está xélido
a lonxitude desta cadea en carateres e: 19 caracteres
levanse escritos :  76 bytes

lemos a primeira cadea:  o tempo está xélido
restan  por ler : 38 bytes
lemos a segunda cadea o tempo está xélido
restan por ler : 0 bytes


Notas:
Podemos comprobar que se intentamos abrir a o ficheiro de texto  text4.txt co editor gedit
non o permite. debemos usar nano , vi , emacs ou outro editor non grafico  e comprobaremos
a forma en que foron grabadas as  cadeas.
podemos ver o contido do ficheiro de texto en hexadecimal e en codigo ASCII  con:
hexdump -C nome_ficheiro
ou ben en binario puro : xxd -b nome_ficheiro
mostrar lonxitude en bytes do ficheiro: wc -c nome_ficheiro