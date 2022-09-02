/* 1.Terminal : 

1."tsc --init" => tsconfig.json (commento target e mudule; scommento riga 50 e 51 e nella 51 aggiungo "script.js" dopo lo /.)

2. Per escludere o includere elementi dall'insieme dei tsc : ""

include "script-incluso.ts"
exclude "script-escluso.ts"

3. "tsc script -w" per compilare il js (-w aggiorna la compilazione ogni volta che aggiungo cose al ts)*/

import { User } from ./Modules/User;