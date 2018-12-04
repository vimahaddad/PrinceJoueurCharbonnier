Feature: transfert un joueur

Scenario Outline: mettre les équipes à jours aux changements.

Given la création de <joueur 1> qui appartient de <equipe 1>
When le manager valide le transfert du <joueur 1> de <equipe 1> à <equipe 2>
Then léquipe de joueur après le transfert sera <equipe 2>

Examples:
| joueur 1	| equipe 1	| equipe 2	|
| Umtiti		| cameroun	| france		|
| Griezmann	| france		| allmagne	|

Scenario Outline: refuser le transfert d’un joueur qui n’existe pas dans l’équipe source.

Given la création de <joueur 1> qui appartient de <equipe 1> 
When le manager valide le transfert du <joueur 1> qui n’est pas dans <equipe 1> à <equipe 2>
Then le système refuse le transfert avec un <messageErreur>

Examples:
| joueur 1	| equipe 1	| equipe 2	| messageErreur															|
| Mbappe		| suisse		| france		| "Le joueur n'est pas dans l'équipe source"|
