Feature: Réserver un billet VIP

Scenario Outline: Le prince réserve un billetVIP

Given la création du <prince>
When le <prince> demander de réserver un <billet>
Then le billet doit etre du type <VIP>

Examples:
| prince		| billet		| type		|
| Charmant	| true			| VIP			|

Scenario Outline: Un charbonnier réserve un billetVIP, ça va etre réfusé

Given la création du <charbonnier>
When <charbonnier> demander de réserver un <billetVIP>
Then son réservation doit etre confirmé par un <message>

Examples:
| charbonnier	| billetVIP	| message		|
| max					| true			| "Vous n'avez pas le droit d'acheter un billet VIP"	|
