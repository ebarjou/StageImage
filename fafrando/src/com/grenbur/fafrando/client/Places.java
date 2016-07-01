package com.grenbur.fafrando.client;

public class Places {
	private static String[] name = new String[]{
			"Alcôve De Courtilleracine", 
			"Alimentation En Eau D’orvanic", 
			"Antre Cachécailleux", 
			"Antre De Hurleneige", 
			"Autel D’inondesel", 
			"Aveuglement De L'erudit", 
			"Balcon Des Délices", 
			"Banc De Varech De Malméduse", 
			"Barrière De Bercebruyère", 
			"Bassin De La Sentinelle", 
			"Belvédère Goutedo", 
			"Bistrot Rouport", 
			"Bivouac Du Lys", 
			"Bord De Valaigu", 
			"Bosquet De Tarstar", 
			"Boucherie Piègécayeux", 
			"Cache à Miel De Boisecoeur", 
			"Cache De L’ours Des Cavernes", 
			"Cache Du Fugitif", 
			"Caisse Du Marchand", 
			"Camp Principal Du Gardien", 
			"Canyons De Gallow", 
			"Carré De Chou Du Bandit", 
			"Cavité De La Cathédrale", 
			"Cavité Du Contremaître", 
			"Cellier De La Garde Du Lion", 
			"Cellier Du Lion Noir", 
			"Champ De Force De La Cinquième Brasse", 
			"Champ De Montesauvage", 
			"Châtiment De Bluup", 
			"Chute D’east End", 
			"Chutes De Gerbécaille", 
			"Chutes De La Génitrice", 
			"Cisaillement Interdit", 
			"Coeur Du Flacon Du Fondateur", 
			"Coffre-fort De Kevach", 
			"Coin D'anya", 
			"Coin De Castavall", 
			"Coin Du Magièdre", 
			"Col Des Frères", 
			"Col Du Coeur Criant", 
			"Console De Commande Principale Lin39", 
			"Contrepoids D’osenfold", 
			"Côte De Couvedrake", 
			"Côte De Tagotl", 
			"Cour Des Chutes Brisées", 
			"Cour Des Chutes De La Biche", 
			"Crevasse Du Gibier", 
			"Crique D’isenfall", 
			"Crique De Trouvécaille", 
			"Débarras D’ulta", 
			"Dents De La Corruption", 
			"Désir De Pochtecatl", 
			"Déversoir De Thaumanova", 
			"Distillerie De La Chouette Cachée", 
			"Dortoir Du Hall De Skibo", 
			"échafaudage Autoporteur", 
			"Emplacement Hanté", 
			"Emprise Agitée", 
			"Ermitage Abandonné", 
			"Escarpement Du Pêcheur", 
			"Etreinte De L’hymne", 
			"Excavation Profanée", 
			"Faille De Pouacregriffe", 
			"Fière Tanière Du Jaguar", 
			"Folie De Widd", 
			"Fontaine De Verdance", 
			"Fontaine Des Racines Cachées", 
			"Forage Du Nid De Skelk", 
			"Fosse De La Guivre Des Glaces", 
			"Fosse De Piègetroll", 
			"Fouilles De Stigmafrappe", 
			"Fouilleur De Fumier", 
			"Foyer De Kari", 
			"Frayère Des Drakes Des Récifs", 
			"Fuite De Toxal", 
			"Galerie Du Limon Sanglant", 
			"Geôle De Provatum", 
			"Gouffre De Whitland", 
			"Grenier Effondré", 
			"Griffure De L’éclat Céleste", 
			"Griffure Invisible", 
			"Grotte D’eaudefonte", 
			"Grotte De Gorgetoile", 
			"Grotte De Lawen", 
			"Grotte Oubliée", 
			"Gué Kraalétroi", 
			"Guet De La Bagarre De Barils", 
			"Guet Réverbérant", 
			"Guivre Des Sables Maraudeuse", 
			"Hall De Guilde Du Destin", 
			"Halte De Coupegorge", 
			"Halte De Soren Draa", 
			"Impasse Du Gladiver", 
			"Jardin De Fortepatte", 
			"Klub Des Karkas", 
			"L’impasse Du Peuple", 
			"Laboratoire De La Taverne De Turai", 
			"La Sellette De Kaldar", 
			"Le Devoir De Morndottir", 
			"Le Magasin Des Ouvriers", 
			"Les Marches Du Talus", 
			"Marches Vaporeuses", 
			"Mirador Beetlestone", 
			"Monument à L’ancien", 
			"Motte De Lamenoire", 
			"Mouillage De Covington", 
			"Mouillage Du Capitaine", 
			"Mur D’enceinte De Claypool", 
			"Nid D’araignée Cavernicole", 
			"Nid De Raptor", 
			"Objets Trouvés De L’autorité Du Port", 
			"œil Du Scorpion Des Mers", 
			"œuvre D’heidi", 
			"Paddock Du Moa Vert", 
			"Palan Charmine", 
			"Panorama De Phasmatis", 
			"Parapet Des Constellations", 
			"Pas De Tir De Mina", 
			"Pavillon De Grenth", 
			"Pavillon Du Seigneur", 
			"Perchoir D’œil-de-faucon", 
			"Perchoir De L’ermite", 
			"Perchoir De Raptor", 
			"Perchoir Tubavapeur", 
			"Pergola D’aubeluit", 
			"Pic Du Béliervédère", 
			"Place Engloutie", 
			"Plage Nécrolithe", 
			"Planche à Dessin De Tekki", 
			"Plateau De Krallcamden", 
			"Plongeur Focebourbié", 
			"Poche De Diablotin De Feu", 
			"Point De Vue D’isgarren", 
			"Point De Vue De Dockfer", 
			"Point De Vue De Gnashar", 
			"Point De Vue De Rurik", 
			"Pont Du Guet-du-feu", 
			"Porche De Fawcett", 
			"Port Extérieur Du Vizir", 
			"Porte De Droknah", 
			"Porte De Wikk", 
			"Portique De Rata Pten", 
			"Poste De Vigie De Décimus", 
			"Préfecture De Lychcroft", 
			"Prison De Taupvlaquie", 
			"Promontoire De Portmatt", 
			"Quai De Lestepied", 
			"Recoin Du Corbeau", 
			"Recoin Du Scriptorium", 
			"Recoin Lapidaire De Flakk", 
			"Refuge D’antreneige", 
			"Refuge De Siamouth", 
			"Refuge Du Stentor", 
			"Refuge Percebul", 
			"Repaire De L’arctodus", 
			"Repaire De L’autel Du Ruisseau", 
			"Repaire De Soufflettin", 
			"Repli Stratégique", 
			"Retraite Gelée", 
			"Rotonde De Soggorsort", 
			"Ruelle Du Vadrouilleur De L’est", 
			"Salon D’esparvent", 
			"Salon De Wrelk", 
			"Sanctuaire Hanté Par Un Diablotin", 
			"Sanctuaire Piersacrée", 
			"Saut De Drakefaille", 
			"Saut De La Conceptualisation", 
			"Saut De Mistriven", 
			"Sépulcre Azumière", 
			"Sépulcre Ravagé", 
			"Seuil D’usharr", 
			"Sommet De L’epave", 
			"Source De Brûlereinette", 
			"Source De Dwayna", 
			"Source Des Lamentations", 
			"Surprise D’elise", 
			"Surveillant De Folleflamme", 
			"Terrasse De Wassa", 
			"Tour De Guet De Mâchefléau", 
			"Tour De La Tribulation", 
			"Trou De Tirailleur De Creusepierre", 
			"Tunnel De Bandacier", 
			"Tunnel Sous Le Lac", 
			"Upsilon Hyperboloïde", 
			"Vallon De Cymbel",   
			"$"};
	
	private static String[][] file = new String[][]{
		/*Alcôve de Courtilleracine*/
		{"http://image.noelshack.com/fichiers/2013/16/1366476839-gardenroot-alcove-le-bosquet-2.jpg", "http://image.noelshack.com/fichiers/2013/16/1366476829-gardenroot-alcove-le-bosquet-1.jpg"},
		/*Alimentation en eau d’Orvanic*/
		{"http://image.noelshack.com/fichiers/2013/16/1366537156-orvanic-sourcewaters-lumillule-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366537169-organic-sourcewaters-lumillule-2.jpg", "http://image.noelshack.com/fichiers/2013/16/1366537196-organic-sourcewaters-lumillule-3.jpg"},
		/*Antre cachécailleux*/
		{"http://image.noelshack.com/fichiers/2013/19/1368291278-skalestash-hideway-1.jpg", "http://image.noelshack.com/fichiers/2013/19/1368291284-skalestash-hideway-2.jpg"},
		/*Antre de Hurleneige*/
		{"http://image.noelshack.com/fichiers/2013/16/1366547289-snowhowl-den-congeres-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366547301-snowhowl-den-congeres-2.jpg"},
		/*Autel d’Inondesel*/
		{"http://image.noelshack.com/fichiers/2013/16/1366544859-saltflood-altar-lumillule-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366544874-saltflood-altar-lumillule-2.jpg", "http://image.noelshack.com/fichiers/2013/16/1366544882-saltflood-altar-lumillule-3.jpg", "http://image.noelshack.com/fichiers/2013/16/1366544890-saltflood-altar-lumillule-4.jpg"},
		/*Aveuglement de l'Erudit*/
		{"http://image.noelshack.com/fichiers/2013/16/1366545043-scholar-s-blind-hantedraguerre-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366545055-scholar-s-blind-hantedraguerre-2.jpg"},
		/*Balcon des délices*/
		{"http://image.noelshack.com/fichiers/2013/16/1366454028-delight-s-balcony-malchor-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366454038-delight-s-balcony-malchor-2.jpg", "http://image.noelshack.com/fichiers/2013/16/1366454049-delight-s-balcony-malchor-3.jpg"},
		/*Banc de Varech de Malméduse*/
		{"http://image.noelshack.com/fichiers/2013/14/1365369175-badjelly-kelpbed-congeres-d-entreneige.jpg", "http://image.noelshack.com/fichiers/2014/23/1402058594-banc-de-varech-malmeduse04.jpg"},
		/*Barrière de Bercebruyère*/
		{"http://image.noelshack.com/fichiers/2013/16/1366371370-briarthorn-barrier-foret-de-caledon-passage-de-la-spirale.jpg", "http://image.noelshack.com/fichiers/2014/23/1402058836-barriere-de-bercebruyere04.jpg"},
		/*Bassin de la Sentinelle*/
		{"http://image.noelshack.com/fichiers/2013/16/1366545283-sentinel-sink-marais-de-fer-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366545296-sentinel-sink-marais-de-fer-2.jpg", "http://image.noelshack.com/fichiers/2013/16/1366545305-sentinel-sink-marais-de-fer-3.jpg"},
		/*Belvédère goutedo */
		{"http://image.noelshack.com/fichiers/2013/21/1369238775-steamscrap-overlook-1.jpg", "http://image.noelshack.com/fichiers/2013/21/1369238779-steamscrap-overlook-2.jpg"},
		/*Bistrot rouport */
		{"http://image.noelshack.com/fichiers/2013/19/1368289391-wheelport-pub-1.jpg", "http://image.noelshack.com/fichiers/2013/19/1368289397-wheelport-pub-2.jpg", "http://image.noelshack.com/fichiers/2013/19/1368289402-wheelport-pub-3.jpg"},
		/*Bivouac du Lys*/
		{"http://image.noelshack.com/fichiers/2013/16/1366478370-lily-s-bivvy-flambecoeur-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366478380-lily-s-bivvy-flambecoeur-2.jpg"},
		/*Bord de Valaigu*/
		{"http://image.noelshack.com/fichiers/2013/16/1366545353-sharkhallow-s-edge-strie-flamboyante-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366545368-sharkhallow-s-edge-strie-flamboyante-2.jpg"},
		/*Bosquet de Tarstar*/
		{"http://image.noelshack.com/fichiers/2013/16/1366551837-tarstar-copse-flambecoeur-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366551848-tarstar-copse-flambecoeur-2.jpg"},
		/*Boucherie piègécayeux */
		{"http://image.noelshack.com/fichiers/2013/19/1368361357-skalecatch-butcher-shop-1.jpg", "http://image.noelshack.com/fichiers/2013/19/1368361361-skalecatch-butcher-shop-2.jpg"},
		/*Cache à miel de Boisecoeur*/
		{"http://image.noelshack.com/fichiers/2013/16/1366477565-heartwood-honey-cache-vallee-de-la-reine.jpg"},
		/* Cache de l’Ours des cavernes*/
		{"http://image.noelshack.com/fichiers/2014/23/1402061466-cache-de-lours-des-cavernes03.jpg", "http://image.noelshack.com/fichiers/2014/23/1402061468-cache-de-lours-des-cavernes04.jpg"},
		/*Cache du fugitif*/
		{"http://image.noelshack.com/fichiers/2013/16/1366376430-cache-of-the-pursued-rivage-maudit-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366376472-cache-of-the-pursued-rivage-maudit-2.jpg"},
		/*Caisse du marchand*/
		{"http://image.noelshack.com/fichiers/2013/16/1366552486-trader-s-tash-hoelbrak-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366552491-trader-s-tash-hoelbrak-2.jpg"},
		/*Camp principal du gardien*/
		{"http://image.noelshack.com/fichiers/2013/16/1366477436-guardian-overwatch-hinterlands-arathis-2.jpg", "http://image.noelshack.com/fichiers/2013/16/1366477426-guardian-overwatch-hinterlands-arathis-1.jpg"},
		/*Canyons de Gallow*/
		{"http://image.noelshack.com/fichiers/2013/16/1366476748-gallow-canyons-brisban-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366476781-gallow-canyons-brisban-2.jpg"},
		/*Carré de chou du bandit*/
		{"http://image.noelshack.com/fichiers/2013/14/1365368045-bandit-s-cabbage-patch-hinterlands-harathis.jpg"},
		/*Cavité de la cathédrale*/
		{"http://image.noelshack.com/fichiers/2013/16/1366378509-cathedral-s-cavity-saut-de-malchior-2.jpg"},
		/*Cavité du Contremaître*/
		{"http://image.noelshack.com/fichiers/2013/16/1366476270-foreman-s-recess-hantedraguerre-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366476287-foreman-s-recess-hantedraguerre-2.jpg", "http://image.noelshack.com/fichiers/2014/23/1402063192-cavite-du-contremaitre04.jpg"},
		/*Cellier de la Garde du Lion*/
		{"http://image.noelshack.com/fichiers/2013/16/1366478424-lionguard-larder-contreforts-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366478435-lionguard-larder-contreforts-2.jpg"},
		/*Cellier du Lion Noir*/
		{"http://image.noelshack.com/fichiers/2013/14/1365371640-black-lionroot-cellar-le-bosquet-passage-du-speculateur.jpg", "http://image.noelshack.com/fichiers/2014/23/1402063725-cellier-du-lion-noir04.jpg"},
		/*Champ de force de la cinquième brasse*/
		{"http://image.noelshack.com/fichiers/2013/16/1366455696-fathom-five-forcefiels-devastation-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366455706-fathom-five-forcefield-devastation-2.jpg", "http://image.noelshack.com/fichiers/2013/16/1366455714-fathom-five-forcefield-devastation-3.jpg"},
		/*Champ de Montesauvage*/
		{"http://image.noelshack.com/fichiers/2013/16/1366539410-risewild-green-maree-sanglante-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366539423-risewild-green-maree-sanglante-2.jpg"},
		/*Châtiment de Bluup */
		{"http://image.noelshack.com/fichiers/2013/19/1368287221-bluup-s-comeuppance-1.jpg", "http://image.noelshack.com/fichiers/2013/19/1368287324-bluup-s-comeuppance-2.jpg", "http://image.noelshack.com/fichiers/2013/19/1368287357-blupp-s-comeuppance-3.jpg", "http://image.noelshack.com/fichiers/2013/19/1368287382-bluup-s-comeuppance-4.jpg", "http://image.noelshack.com/fichiers/2013/19/1368287403-bluup-s-comeuppance-5.jpg"},
		/*Chute d’East End*/
		{"http://image.noelshack.com/fichiers/2013/16/1366455454-east-end-falls-terres-sauvages-de-brisbane.jpg", "http://image.noelshack.com/fichiers/2014/23/1402064429-chutes-deast-end04.jpg"},
		/*Chutes de Gerbécaille */
		{"http://image.noelshack.com/fichiers/2013/16/1366545583-skalesplash-fall-canopee-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366545599-skalesplash-fall-canopee-2.jpg", "http://image.noelshack.com/fichiers/2013/16/1366545624-skalesplash-fall-canopee-3.jpg"},
		/*Chutes de la Génitrice*/
		{"http://image.noelshack.com/fichiers/2013/16/1366372147-broodmother-falls-gorges-glacees-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366372172-broodmother-falls-gorges-glacees-2.jpg", "http://image.noelshack.com/fichiers/2013/16/1366372195-broodmother-falls-gorges-glacees-3.jpg"},
		/*Cisaillement interdit*/
		{"http://image.noelshack.com/fichiers/2013/16/1366476189-forbidden-shear-malchor-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366476208-forbidden-shear-malchor-2.jpg"},
		/*Coeur du flacon du fondateur*/
		{"http://image.noelshack.com/fichiers/2013/16/1366476418-founder-s-flagon-hearth-champs-de-ruines-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366476463-founder-s-flagon-hearth-champs-de-ruines-2.jpg"},
		/*Coffre-fort de Kevach*/
		{"http://image.noelshack.com/fichiers/2013/21/1369238218-kevach-s-strongroom-1.jpg", "http://image.noelshack.com/fichiers/2013/21/1369238224-kevach-s-strongroom-2.jpg", "http://image.noelshack.com/fichiers/2013/21/1369238228-kevach-s-strongroom-3.jpg"},
		/*Coin d'Anya*/
		{"http://image.noelshack.com/fichiers/2014/23/1402065254-coin-danya03.jpg"},
		/*Coin de Castavall*/
		{"http://image.noelshack.com/fichiers/2013/16/1366378112-castavall-corner-maree-sanglante-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366378137-castavall-corner-maree-sanglante-2.jpg"},
		/*Coin du Magièdre*/
		{"http://image.noelshack.com/fichiers/2013/16/1366478528-magihedron-corner-rata-sum-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366478539-magihedron-corner-rata-sum-2.jpg"},
		/*Col des Frères*/
		{"http://image.noelshack.com/fichiers/2013/16/1366373443-brother-s-notch-veines-du-dragon-hoelbrach.jpg"},
		/*Col du Coeur criant*/
		{"http://image.noelshack.com/fichiers/2013/16/1366477506-heart-speaks-notch-flambecoeur-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366477519-heart-speaks-notch-flambecoeur-2.jpg"},
		/*Console de commande principale LIN39 */
		{"http://image.noelshack.com/fichiers/2013/19/1368293149-master-control-1.jpg", "http://image.noelshack.com/fichiers/2013/19/1368293155-master-control-2.jpg"},
		/*Contrepoids d’Osenfold*/
		{"http://image.noelshack.com/fichiers/2013/16/1366537350-osenfold-counterweights-contreforts-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366537365-osenfold-counterweights-contreforts-2.jpg"},
		/*Côte de Couvedrake*/
		{"http://image.noelshack.com/fichiers/2013/16/1366454368-drakehatch-shore-lac-brechezeaux-plateau-de-diessa.jpg"},
		/*Côte de Tagotl */
		{"http://image.noelshack.com/fichiers/2013/16/1366551574-tagotl-shore-kessex-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366551588-tagotl-shore-kessex-2.jpg"},
		/*Cour des Chutes brisées*/
		{"http://image.noelshack.com/fichiers/2013/16/1366372422-broken-falls-courtyard-ruines-de-rin-citadelle-noire.jpg"},
		/*Cour des Chutes de la Biche*/
		{"http://image.noelshack.com/fichiers/2013/16/1366454245-doefalls-plaines-d-ashford.jpg"},
		/*Crevasse du Gibier*/
		{"http://image.noelshack.com/fichiers/2013/16/1366553483-venison-hollow-lornar-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366553493-venison-hollow-lornar-2.jpg"},
		/*Crique d’Isenfall*/
		{"http://image.noelshack.com/fichiers/2013/19/1368367128-isenfall-wash-1.jpg", "http://image.noelshack.com/fichiers/2013/19/1368367134-isenfall-wash-2.jpg"},
		/*Crique de Trouvécaille*/
		{"http://image.noelshack.com/fichiers/2013/16/1366545509-skalefound-cove-flambecoeur-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366545516-skalefound-cove-flambecoeur-2.jpg", "http://image.noelshack.com/fichiers/2014/23/1402067247-gw521.jpg"},
		/*Débarras d’Ulta*/
		{"http://image.noelshack.com/fichiers/2013/16/1366552883-ulta-scraproom-brisban-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366552891-ulta-scraproom-brisban-2.jpg"},
		/*Dents de la corruption*/
		{"http://image.noelshack.com/fichiers/2013/16/1366381538-corruption-s-teeth-gorges-glacees-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366381561-corruption-s-teeth-gorges-glacees-2.jpg"},
		/*Désir de Pochtecatl*/
		{"http://image.noelshack.com/fichiers/2013/19/1368306852-pochtecatl-s-desire-1.jpg", "http://image.noelshack.com/fichiers/2013/19/1368306859-pochtecatl-s-desire-2.jpg"},
		/*Déversoir de Thaumanova*/
		{"http://image.noelshack.com/fichiers/2013/16/1366551951-thaumanova-spillway-metrica-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366551962-thaumanova-spillway-metrica-2.jpg"},
		/*Distillerie de la Chouette cachée*/
		{"http://image.noelshack.com/fichiers/2013/16/1366477672-hidden-owl-distillery-congeres-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366477686-hidden-owl-distillery-congeres-2.jpg"},
		/*Dortoir du hall de Skibo */
		{"http://image.noelshack.com/fichiers/2013/19/1368347709-skibo-hall-dormitory-1.jpg", "http://image.noelshack.com/fichiers/2013/19/1368347715-skibo-hall-dormitory-2.jpg", "http://image.noelshack.com/fichiers/2013/19/1368347718-skibo-hall-dormitory-3.jpg"},
		/*Échafaudage autoporteur*/
		{"http://image.noelshack.com/fichiers/2013/16/1366476584-freestand-scaffold-citadelle-noire.jpg"},
		/*Emplacement hanté*/
		{"http://image.noelshack.com/fichiers/2013/16/1366547831-spectrehaunt-socket-malchor-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366547840-spectrehaunt-socket-malchor-2.jpg"},
		/*Emprise agitée*/
		{"http://image.noelshack.com/fichiers/2013/16/1366539142-restless-footings-maelstrom-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366539153-restless-footings-maelstrom-2.jpg"},
		/*Ermitage abandonné*/
		{"http://image.noelshack.com/fichiers/2013/16/1366553362-vacant-hermitage-strie-flamboyante-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366553374-vancant-hermitage-strie-flamboyante2.jpg", "http://image.noelshack.com/fichiers/2013/16/1366553379-vacant-hermitage-strie-flamboyante-3.jpg"},
		/*Escarpement du pêcheur*/
		{"http://image.noelshack.com/fichiers/2013/16/1366475937-fisher-s-crag-province-de-metrica.jpg", "http://image.noelshack.com/fichiers/2014/23/1402072631-escarpement-du-pecheur04.jpg"},
		/*Etreinte de l’hymne*/
		{"http://image.noelshack.com/fichiers/2013/19/1368374457-anthem-s-hold-1.jpg", "http://image.noelshack.com/fichiers/2013/19/1368374462-anthem-s-hold-2.jpg"},
		/*Excavation profanée*/
		{"http://image.noelshack.com/fichiers/2013/16/1366453991-defiled-delve-collines-de-kesse.jpg"},
		/*Faille de Pouacregriffe*/
		{"http://image.noelshack.com/fichiers/2013/16/1366454154-dirtclaw-cleft-marais-de-fer-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366454164-dirtclaw-cleft-marais-de-fer-2.jpg", "http://image.noelshack.com/fichiers/2013/16/1366454177-dirtclaw-cleft-marais-de-fer-3.jpg"},
		/*Fière tanière du jaguar*/
		{"http://image.noelshack.com/fichiers/2013/16/1366477957-jaguar-pride-den-metrica-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366477964-jaguar-pride-den-metrica-2.jpg"},
		/*Folie de Widd*/
		{"http://image.noelshack.com/fichiers/2013/19/1368308040-widd-s-folly-1.jpg", "http://image.noelshack.com/fichiers/2013/19/1368308054-widd-s-folly-2.jpg"},
		/*Fontaine de Verdance*/
		{"http://image.noelshack.com/fichiers/2013/16/1366553572-verdance-front-rivage-maudit-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366553578-verdance-front-rivage-maudit-2.jpg"},
		/*Fontaine des racines cachées*/
		{"http://image.noelshack.com/fichiers/2013/14/1365366867-backroot-fountain-le-bosquet.jpg"},
		/*Forage du nid de skelk*/
		{"http://image.noelshack.com/fichiers/2013/16/1366545780-skelkness-borehole-gorges-glacees-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366545793-skelknest-borehole-gorges-glacees-2.jpg", "http://image.noelshack.com/fichiers/2013/16/1366545799-skelkness-borehole-gorges-glacees-3.jpg", "http://image.noelshack.com/fichiers/2013/16/1366546286-skelknest-borehole-gorges-glacees-4.jpg"},
		/*Fosse de la guivre des glaces*/
		{"http://image.noelshack.com/fichiers/2013/16/1366477737-icewurm-trench-gorges-glacees-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366477753-icewurm-trench-gorges-glacees-2.jpg"},
		/*Fosse de Piègetroll*/
		{"http://image.noelshack.com/fichiers/2013/16/1366552628-trolltrap-pit-lornar-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366552638-trolltrap-pit-lornar-2.jpg", "http://image.noelshack.com/fichiers/2013/16/1366552646-trolltrap-pit-lornar-3.jpg"},
		/*Fouilles de Stigmafrappe*/
		{"http://image.noelshack.com/fichiers/2013/15/1365425010-brandstrike-dig-champs-de-ruines.jpg"},
		/*Fouilleur de fumier*/
		{"http://image.noelshack.com/fichiers/2013/16/1366476057-forager-s-midden-falaises-de-hantedraguerres-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366476077-forager-s-midden-falaises-de-hantedraguerres-2.jpg", "http://image.noelshack.com/fichiers/2013/16/1366476155-forager-s-midden-falaises-de-hanedraguerres-3.jpg"},
		/*Foyer de Kari*/
		{"http://image.noelshack.com/fichiers/2013/16/1366478050-kari-s-hot-spot-kessex-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366478062-kari-s-hot-spot-kessex-2.jpg"},
		/*Frayère des drakes des récifs*/
		{"http://image.noelshack.com/fichiers/2013/21/1369222030-reef-drake-den-1.jpg", "http://image.noelshack.com/fichiers/2013/21/1369222037-reef-drake-den-2.jpg", "http://image.noelshack.com/fichiers/2013/21/1369222037-reef-drake-den-2.jpg", "http://image.noelshack.com/fichiers/2013/21/1369222041-reef-drake-den-3.jpg"},
		/*Fuite de Toxal*/
		{"http://image.noelshack.com/fichiers/2013/19/1368310554-toxal-spill-brisban-1.jpg", "http://image.noelshack.com/fichiers/2013/19/1368310563-toxal-spill-brisban-2.jpg"},
		/*Galerie du limon sanglant*/
		{"http://image.noelshack.com/fichiers/2013/15/1365424972-blood-oooze-galery-maree-sanglante.jpg"},
		/*Geôle de Provatum*/
		{"http://image.noelshack.com/fichiers/2013/16/1366538211-provatum-carcer-flambecoeur-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366538229-provatum-carcer-flambecoeur-2.jpg"},
		/*Gouffre de Whitland*/
		{"http://image.noelshack.com/fichiers/2013/16/1366554016-whitland-sinkhole-maestrom-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366554026-whitland-sinkhole-maestrom-2.jpg"},
		/*Grenier effondré*/
		{"http://image.noelshack.com/fichiers/2013/16/1366545408-shattered-loft-lumillule-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366545418-shattered-loft-lumillule-2.jpg"},
		/*Griffure de l’éclat céleste*/
		{"http://image.noelshack.com/fichiers/2013/16/1366545915-skyshrine-scratch-hinterlands-arathis-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366545929-skyshrine-scratch-hinterlands-arathis-2.jpg"},
		/*Griffure invisible*/
		{"http://image.noelshack.com/fichiers/2013/16/1366553011-unseen-scratch-caledon-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366553017-unseen-scratch-caledon-2.jpg", "http://image.noelshack.com/fichiers/2013/16/1366553026-unseen-scratch-caledon-3.jpg"},
		/*Grotte d’Eaudefonte*/
		{"http://image.noelshack.com/fichiers/2013/16/1366478575-meltwater-cave-canopee-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366536136-meltwater-cave-canopee-2.jpg"},
		/*Grotte de Gorgetoile*/
		{"http://image.noelshack.com/fichiers/2013/16/1366377215-canyonweb-cave-strie-flamboyante-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366377245-canyonweb-cave-strie-flamboyante-2.jpg"},
		/*Grotte de Lawen*/
		{"http://image.noelshack.com/fichiers/2013/16/1366478261-lawen-grotto-gendarran-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366478269-lawen-grotto-gendarran-2.jpg"},
		/*Grotte Oubliée*/
		{"http://image.noelshack.com/fichiers/2013/16/1366476350-forgotten-grotto-strie-flamboyante-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366476372-forgotten-grotto-strie-flamboyante-2.jpg"},
		/*Gué kraalétroi*/
		{"http://image.noelshack.com/fichiers/2013/19/1368359063-narrowkraal-crossing-1.jpg", "http://image.noelshack.com/fichiers/2013/19/1368359068-narrowkraal-crossing-2.jpg"},
		/*Guet de la bagarre de barils*/
		{"http://image.noelshack.com/fichiers/2013/16/1366478108-kegbrawl-watch-hoelbrak.jpg"},
		/*Guet réverbérant*/
		{"http://image.noelshack.com/fichiers/2013/16/1366539259-reverberant-s-watch-contreforts-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366539273-reverberant-s-watch-contreforts-2.jpg"},
		/*Guivre des sables maraudeuse*/
		{"http://image.noelshack.com/fichiers/2013/21/1369222629-sandwurm-prowl-1.jpg", "http://image.noelshack.com/fichiers/2013/21/1369222635-sandwurm-prowl-2.jpg"},
		/*Hall de Guilde du Destin*/
		{"http://image.noelshack.com/fichiers/2013/16/1366454107-destiny-s-guildhall-vallee-de-la-reine-village-de-shaemoor.jpg"},
		/*Halte de Coupegorge*/
		{"http://image.noelshack.com/fichiers/2013/16/1366453884-cutthroat-s-rest-champs-de-gendarran.jpg"},
		/*Halte de Soren Draa*/
		{"http://image.noelshack.com/fichiers/2013/16/1366547573-soren-draa-rest-shop-metrica-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366547580-soren-draa-rest-shop-metrica-2.jpg"},
		/*Impasse du Gladiver*/
		{"http://image.noelshack.com/fichiers/2013/16/1366554377-winterknell-impasse-rivage-maudit-2.jpg"},
		/*Jardin de Fortepatte*/
		{"http://image.noelshack.com/fichiers/2013/16/1366550077-strongpaw-s-garden-plateau-de-diessa.jpg"},
		/*Klub des Karkas*/
		{"http://image.noelshack.com/fichiers/2013/21/1369221408-the-karka-club-1.jpg", "http://image.noelshack.com/fichiers/2013/21/1369221423-the-karka-club-2.jpg"},
		/*L’impasse du peuple*/
		{"http://image.noelshack.com/fichiers/2013/24/1370856564-impasse-du-peuple-5.jpg", "http://image.noelshack.com/fichiers/2013/24/1370856668-impasse-du-peuple-4.jpg", "http://image.noelshack.com/fichiers/2013/24/1370856851-impasse-du-peuple-3.jpg", "http://image.noelshack.com/fichiers/2013/24/1370857071-impasse-du-peuple-2.jpg"},
		/*Laboratoire de la taverne de Turai*/
		{"http://image.noelshack.com/fichiers/2013/16/1366552769-turai-tavern-promontoire-divin-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366552776-turai-tavern-promontoire-divin-2.jpg"},
		/*La sellette de Kaldar*/
		{"http://image.noelshack.com/fichiers/2013/19/1368290182-kaldar-s-hot-seat-1.jpg", "http://image.noelshack.com/fichiers/2013/19/1368290187-kaldar-s-hot-seat-2.jpg"},
		/*Le devoir de Morndottir*/
		{"http://image.noelshack.com/fichiers/2013/16/1366477391-grimdottir-s-duty-hoelbrak.jpg"},
		/*Le magasin des ouvriers*/
		{"http://image.noelshack.com/fichiers/2013/16/1366552274-the-worker-s-stores-hantedraguerre-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366552284-the-worker-s-stores-hantedraguerre-2.jpg"},
		/*Les Marches du Talus*/
		{"http://image.noelshack.com/fichiers/2013/16/1366551693-talus-steps-canopee-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366551703-talus-steps-canopee-2.jpg", "http://image.noelshack.com/fichiers/2013/16/1366551712-talus-steps-canopee-3.jpg"},
		/*Marches vaporeuses*/
		{"http://image.noelshack.com/fichiers/2013/21/1369224336-steamy-steps-1.jpg","http://image.noelshack.com/fichiers/2013/21/1369224339-steamy-steps-2.jpg", "http://image.noelshack.com/fichiers/2013/21/1369224343-steamy-steps-3.jpg"},
		/*Mirador Beetlestone*/
		{"http://image.noelshack.com/fichiers/2013/19/1368304250-beetlestone-mirador-1.jpg", "http://image.noelshack.com/fichiers/2013/19/1368304256-beetlestone-mirador-2.jpg"},
		/*Monument à l’Ancien*/
		{"http://image.noelshack.com/fichiers/2013/21/1369225756-monument-to-the-ancient-one-1.jpg", "http://image.noelshack.com/fichiers/2013/21/1369225759-monument-to-the-ancient-one-2.jpg"},
		/*Motte de Lamenoire*/
		{"http://image.noelshack.com/fichiers/2013/14/1365370434-blackblade-butte-fontaine-de-rand-plateau-de-diessa.jpg"},
		/*Mouillage de Covington*/
		{"http://image.noelshack.com/fichiers/2013/16/1366453785-covington-s-stowage-maree-sanglante-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366381922-covington-s-stawage-maree-sanglante-2.jpg", "http://image.noelshack.com/fichiers/2013/16/1366453819-covington-s-stowage-maree-sanglante-3.jpg"},
		/*Mouillage du Capitaine*/
		{"http://image.noelshack.com/fichiers/2013/16/1366377636-captain-s-berth-malchor-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366377661-captain-s-berth-malchor-2.jpg"},
		/*Mur d’enceinte de Claypool*/
		{"http://image.noelshack.com/fichiers/2013/16/1366381520-claypool-bailey-village-de-claypool.jpg"},
		/*Nid d’araignée cavernicole*/
		{"http://image.noelshack.com/fichiers/2013/16/1366381474-cave-spider-nidus-lornar-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366381489-cave-spider-nidus-lornar-2.jpg"},
		/*Nid de raptor*/
		{"http://image.noelshack.com/fichiers/2013/19/1368365759-raptor-s-aerie-1.jpg", "http://image.noelshack.com/fichiers/2013/19/1368365765-raptor-s-aerie-2.jpg"},
		/*Objets trouvés de l’Autorité du Port*/
		{"http://image.noelshack.com/fichiers/2013/16/1366537832-port-authority-lost-and-found-rata-sum-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366537852-port-authority-lost-and-found-rata-sum-2.jpg"},
		/*Œil du Scorpion des mers*/
		{"http://image.noelshack.com/fichiers/2013/16/1366545226-sea-scorpion-s-eye-rivage-maudit-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366545239-sea-scorpion-s-eye-rivage-maudit-2.jpg"},
		/*Œuvre d’Heidi*/
		{"http://image.noelshack.com/fichiers/2013/19/1368285358-heidi-s-showpiece-1.jpg", "http://image.noelshack.com/fichiers/2013/19/1368285381-heidi-s-showpiece-2.jpg", "http://image.noelshack.com/fichiers/2013/19/1368285402-heidi-s-showpiece-3.jpg"},
		/*Paddock du moa vert*/
		{"http://image.noelshack.com/fichiers/2013/16/1366477309-green-moa-paddock-caledon-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366477320-green-moa-paddock-caledon-2.jpg"},
		/*Palan charmine*/
		{"http://image.noelshack.com/fichiers/2013/19/1368363526-orecart-hoist-1.jpg", "http://image.noelshack.com/fichiers/2013/19/1368363532-orecart-hoist-2.jpg"},
		/*Panorama de Phasmatis*/
		{"http://image.noelshack.com/fichiers/2013/16/1366537674-phasmatis-prospect-ashford-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366537687-phasmatis-prspect-ashford-2.jpg"},
		/*Parapet des constellations*/
		{"http://image.noelshack.com/fichiers/2013/16/1366381529-constellation-parpet-refuge-des-constellations-le-bosquet.jpg", "http://image.noelshack.com/fichiers/2013/20/1368983471-constellation-parapet-1.jpg", "http://image.noelshack.com/fichiers/2013/20/1368983479-constellation-parapet-2.jpg"},
		/*Pas de Tir de Mina*/
		{"http://image.noelshack.com/fichiers/2013/16/1366535010-mina-s-target-shoot-promontoire-divin-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366535054-mina-s-target-shoot-promontoire-divin-2.jpg"},
		/*Pavillon de Grenth*/
		{"http://image.noelshack.com/fichiers/2013/16/1366477356-grenth-s-pavillion-promontoire-divin.jpg"},
		/*Pavillon du seigneur*/
		{"http://image.noelshack.com/fichiers/2013/16/1366537510-overlord-lodge-kesse-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366537523-overlord-lodge-kesse-2.jpg"},
		/*Perchoir d’œil-de-faucon*/
		{"http://image.noelshack.com/fichiers/2013/20/1368983026-hawkeye-perch-1.jpg", "http://image.noelshack.com/fichiers/2013/20/1368983034-hawkeye-perch-2.jpg"},
		/*Perchoir de l’Ermite*/
		{"http://image.noelshack.com/fichiers/2013/16/1366477604-hermit-s-roost-champs-de-ruine-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366477620-hermit-s-roost-champs-de-ruine-2.jpg"},
		/*Perchoir de Raptor*/
		{"http://image.noelshack.com/fichiers/2013/16/1366538714-raptor-s-perch-gendarran-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366538723-raptor-s-perch-gendarran-2.jpg"},
		/*Perchoir Tubavapeur*/
		{"http://image.noelshack.com/fichiers/2013/21/1369223805-steampipe-perch-1.jpg", "http://image.noelshack.com/fichiers/2013/21/1369223815-steampipe-perch-2.jpg", "http://image.noelshack.com/fichiers/2013/21/1369223816-steampipe-perch-3.jpg"},
		/*Pergola d’Aubeluit*/
		{"http://image.noelshack.com/fichiers/2013/16/1366453953-dawngleam-pergola-le-bosquet-passage-de-ronan.jpg"},
		/*Pic du Béliervédère*/
		{"http://image.noelshack.com/fichiers/2013/16/1366538406-ramview-peak-hantedraguerre-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366538421-ramview-peak-hantedraguerre-2.jpg", "http://image.noelshack.com/fichiers/2013/16/1366538429-ramview-peak-hantedraguerre-3.jpg"},
		/*Place engloutie*/
		{"http://image.noelshack.com/fichiers/2013/20/1368982467-drowned-plaza-1.jpg"},
		/*Plage nécrolithe*/
		{"http://image.noelshack.com/fichiers/2013/19/1368288536-necrolith-landing-1.jpg", "http://image.noelshack.com/fichiers/2013/19/1368288541-necrolith-landing-2.jpg"},
		/*Planche à dessin de Tekki*/
		{"http://image.noelshack.com/fichiers/2013/19/1368295404-tekki-s-drawing-board-1.jpg", "http://image.noelshack.com/fichiers/2013/19/1368295409-tekki-s-drawing-board-2.jpg"},
		/*Plateau de Krallcamden*/
		{"http://image.noelshack.com/fichiers/2013/16/1366376879-cademkral-plaines-d-ashford.jpg"},
		/*Plongeur focebourbié*/
		{"http://image.noelshack.com/fichiers/2014/23/1402242568-plongeur-facebourbie03.jpg", "http://image.noelshack.com/fichiers/2014/23/1402242571-plongeur-focebourbie04.jpg"},
		/*Poche de diablotin de feu*/
		{"http://image.noelshack.com/fichiers/2013/16/1366455814-fire-imp-pocket-maelstrom-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366455826-fire-imp-pocket-maelstr-m-2.jpg"},
		/* Point de vue d’Isgarren*/
		{"http://image.noelshack.com/fichiers/2013/19/1368305146-isgarren-viewpoint-1.jpg", "http://image.noelshack.com/fichiers/2013/19/1368305152-isgarren-viewpoint-2.jpg"},
		/*Point de vue de Dockfer*/
		{"http://image.noelshack.com/fichiers/2013/16/1366477902-irondock-viewpoint-ashford-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366477914-irondock-viewpoint-ashford-2.jpg"},
		/*Point de vue de Gnashar*/
		{"http://image.noelshack.com/fichiers/2013/16/1366476883-gnashar-s-viewpoint-brisban-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366477147-gnashar-s-viewpoint-brisban-2.jpg", "http://image.noelshack.com/fichiers/2013/16/1366477237-gnashar-s-viewpoint-brisban-3.jpg"},
		/*Point de vue de Rurik*/
		{"http://image.noelshack.com/fichiers/2013/16/1366539528-rurik-view-promontoire-divin-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366539537-rurik-view-promontoire-divin-2.jpg"},
		/*Pont du Guet-du-feu*/
		{"http://image.noelshack.com/fichiers/2013/16/1366459483-firewatch-flybridge-marais-de-fer-1.jpg", "http://image.noelshack.com/fichiers/2013/22/1370192244-firewatch-flybridge-marais-de-fer-2.jpg"},
		/*Porche de Fawcett*/
		{"http://image.noelshack.com/fichiers/2013/16/1366455774-fawcett-s-porch-hinterlands-arathis.jpg", "http://image.noelshack.com/fichiers/2013/21/1369252146-porche-de-fawcett-4.jpg", "http://image.noelshack.com/fichiers/2013/21/1369252143-porche-de-fawcet-3.jpg"},
		/*Port extérieur du Vizir*/
		{"http://image.noelshack.com/fichiers/2013/16/1366553668-vizier-s-anteport-devastation-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366553676-vizier-s-anteport-devastation-2.jpg"},
		/*Porte de Droknah*/
		{"http://image.noelshack.com/fichiers/2013/16/1366454410-droknah-s-gate-maestrom-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366454428-droknah-s-gate-maestrom-2.jpg", "http://image.noelshack.com/fichiers/2013/16/1366454446-droknah-s-gate-maestrom-3.jpg"},
		/*Porte de Wikk*/
		{"http://image.noelshack.com/fichiers/2013/16/1366554109-wikk-s-gate-canopee-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366554118-wikk-s-gate-canopee-2.jpg"},
		/*Portique de Rata Pten*/
		{"http://image.noelshack.com/fichiers/2013/16/1366538826-rata-pten-mortico-maelstrom-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366538835-rata-pten-mortico-maelstrom-2.jpg"},
		/*Poste de vigie de Décimus*/
		{"http://image.noelshack.com/fichiers/2013/16/1366553901-watchpoint-decimus-ashford-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366553908-watchpoint-decimus-ashford-2.jpg"},
		/*Préfecture de Lychcroft*/
		{"http://image.noelshack.com/fichiers/2013/16/1366478476-lychcroft-wardenship-kesse-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366478485-lychcroft-wardenship-kesse-2.jpg"},
		/*Prison de Taupvlaquie*/
		{"http://image.noelshack.com/fichiers/2013/16/1366536951-moleberia-prison-contreforts-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366536964-moleberia-prison-contreforts-2.jpg"},
		/*Promontoire de Portmatt*/
		{"http://image.noelshack.com/fichiers/2013/16/1366538033-portmatt-s-promontory-maree-sanglante-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366538062-portmat-s-promontory-maree-sanglante-2.jpg"},
		/*Quai de Lestepied*/
		{"http://image.noelshack.com/fichiers/2013/16/1366478325-lightfoot-dock-devastation-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366478332-lightfoot-dock-devastation-2.jpg"},
		/*Recoin du Corbeau*/
		{"http://image.noelshack.com/fichiers/2013/16/1366538949-raven-nook-hoelbrak.jpg"},
		/*Recoin du Scriptorium*/
		{"http://image.noelshack.com/fichiers/2013/16/1366545168-scriptorium-nook-citadelle-noire.jpg"},
		/*Recoin lapidaire de Flakk*/
		{"http://image.noelshack.com/fichiers/2013/16/1366475985-flakk-s-lapidary-nook-rata-sum.jpg"},
		/*Refuge d’Antreneige*/
		{"http://image.noelshack.com/fichiers/2013/16/1366547164-snowden-safehouse-congeres-1.jpg", "http://image.noelshack.com/fichiers/2013/22/1370193293-snowden-safehouse-congeres-2.jpg"},
		/*Refuge de siamouth*/
		{"http://image.noelshack.com/fichiers/2013/16/1366545460-siamoth-refuge-lumillule-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366545472-siamoth-refuge-lumillule-2.jpg"},
		/*Refuge du Stentor*/
		{"http://image.noelshack.com/fichiers/2013/16/1366548087-stentor-shelter-devastation-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366548101-stentor-shelter-devastation-2.jpg"},
		/*Refuge percebul*/
		{"http://image.noelshack.com/fichiers/2013/19/1368360377-burstbubble-blind-1.jpg", "http://image.noelshack.com/fichiers/2013/19/1368360383-burstbubble-blind-2.jpg"},
		/*Repaire de l’Arctodus*/
		{"http://image.noelshack.com/fichiers/2013/14/1365366301-arctodus-haunt-riviere-froidfrill-contrefort-du-voyageur.jpg"},
		/*Repaire de l’Autel du Ruisseau*/
		{"http://image.noelshack.com/fichiers/2013/14/1365365927-altar-brook-vallee-de-l-autel-du-ruisseau-vallee-de-la-reine.jpg"},
		/*Repaire de Soufflettin*/
		{"http://image.noelshack.com/fichiers/2013/16/1366455618-ettinbreath-lair-lornar-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366455644-ettinbreath-lair-lornar-2.jpg"},
		/*Repli stratégique*/
		{"http://image.noelshack.com/fichiers/2013/16/1366551471-tactical-retreat-rivage-maudit-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366551479-tactical-retreat-rivage-maudit-2.jpg"},
		/*Retraite Gelée*/
		{"http://image.noelshack.com/fichiers/2013/16/1366476625-frozen-antrum-canopee-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366476645-frozen-antrum-canopee-2.jpg", "http://image.noelshack.com/fichiers/2013/16/1366476679-frozen-antrum-canopee-3.jpg"},
		/*Rotonde de Soggorsort*/
		{"http://image.noelshack.com/fichiers/2013/16/1366547429-soggorsort-rotunda-caledon-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366547439-soggorsort-rotunda-caledon-2.jpg", "http://image.noelshack.com/fichiers/2013/16/1366547447-soggorsort-rotunda-caledon-3.jpg"},
		/*Ruelle du vadrouilleur de l’est*/
		{"http://image.noelshack.com/fichiers/2013/16/1366455493-eastlurk-alley-quartier-populaire-est-le-promontoire-divin.jpg"},
		/*Salon d’Esparvent*/
		{"http://image.noelshack.com/fichiers/2013/16/1366547698-sparwind-s-lounge-citadelle-noire.jpg"},
		/*Salon de Wrelk*/
		{"http://image.noelshack.com/fichiers/2013/19/1368283728-wrelk-s-salon-1.jpg", "http://image.noelshack.com/minis/2013/19/1368283752-wrelk-s-salon-2.png"},
		/*Sanctuaire hanté par un diablotin*/
		{"http://image.noelshack.com/fichiers/2013/16/1366477850-imphant-hallow-caledon-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366477863-imphant-hallow-caledon-2.jpg"},
		/*Sanctuaire piersacrée*/
		{"http://image.noelshack.com/fichiers/2013/19/1368292027-holystone-sanctum-1.jpg", "http://image.noelshack.com/fichiers/2013/19/1368292035-holystaone-sanctum-2.jpg"},
		/*Saut de Drakefaille*/
		{"http://image.noelshack.com/fichiers/2013/16/1366454282-drakecleft-sheff-champs-de-ruines.jpg"},
		/*Saut de la conceptualisation*/
		{"http://image.noelshack.com/fichiers/2013/16/1366477795-ideation-leap-rata-sum-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366477808-ideation-leap-rata-sum-2.jpg"},
		/*Saut de Mistriven*/
		{"http://image.noelshack.com/fichiers/2013/16/1366535100-mistriven-shelf-lornar-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366535113-mistriven-shelf-lornar-2.jpg"},
		/*Sépulcre azumière*/
		{"http://image.noelshack.com/fichiers/2013/19/1368377319-sepulchre-skylight-1.jpg", "http://image.noelshack.com/fichiers/2013/19/1368377324-sepuchre-skylight-2.jpg"},
		/*Sépulcre ravagé*/
		{"http://image.noelshack.com/fichiers/2013/14/1365371410-blasted-sepulchtre-landes-ravagees-plateau-de-diessa.jpg"},
		/*Seuil d’Usharr*/
		{"http://image.noelshack.com/fichiers/2013/19/1368307713-usharr-s-threshold-1.jpg", "http://image.noelshack.com/fichiers/2013/19/1368307718-usharr-s-threshold-2.jpg"},
		/*Sommet de l’Epave*/
		{"http://image.noelshack.com/fichiers/2013/16/1366478014-junker-s-apex-citadelle-noire.jpg"},
		/*Source de Brûlereinette*/
		{"http://image.noelshack.com/fichiers/2013/16/1366459341-firefrog-springs-limillule.jpg"},
		/*Source de Dwayna*/
		{"http://image.noelshack.com/fichiers/2013/19/1368286111-dwayna-s-fount-1.jpg", "http://image.noelshack.com/fichiers/2013/19/1368286257-dwayna-s-fount-2.jpg"},
		/*Source des lamentations*/
		{"http://image.noelshack.com/fichiers/2013/19/1368369582-source-of-lament-1.jpg", "http://image.noelshack.com/fichiers/2013/19/1368369586-source-of-lament-2.jpg"},
		/*Surprise d’Elise*/
		{"http://image.noelshack.com/fichiers/2013/16/1366455532-elise-s-surprise-hinterlands-arathis.jpg"},
		/*Surveillant de Folleflamme*/
		{"http://image.noelshack.com/fichiers/2013/16/1366554250-wildflame-monitor-province-metrica.jpg"},
		/*Terrasse de Wassa*/
		{"http://image.noelshack.com/fichiers/2013/16/1366553780-wassa-s-terrace-gendarran-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366553791-wassa-s-terrace-gendarran-2.jpg"},
		/*Tour de guet de Mâchefléau*/
		{"http://image.noelshack.com/fichiers/2013/16/1366545096-scourgejaw-watchtower-marais-de-fer-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366545106-scourgejaw-watchtower-marais-de-fer-2.jpg", "http://image.noelshack.com/fichiers/2013/16/1366545117-scourgejaw-watchtower-marais-de-fer-3.jpg"},
		/*Tour de la tribulation*/
		{"http://image.noelshack.com/fichiers/2013/19/1368371671-tower-of-tribulation-1.jpg", "http://image.noelshack.com/fichiers/2013/19/1368371796-tower-of-tribulation-2.jpg"},
		/*Trou de tirailleur de Creusepierre*/
		{"http://image.noelshack.com/fichiers/2013/16/1366548216-stonebore-spiderhole-gendarran-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366548229-stonebore-spiderhole-gendarran-2.jpg"},
		/*Tunnel de Bandacier*/
		{"http://image.noelshack.com/fichiers/2013/16/1366547970-steelband-s-tunnel-strie-flamboyante-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366547981-steelband-s-tunnel-strie-flamboyante-2.jpg"},
		/*Tunnel sous le lac*/
		{"http://image.noelshack.com/fichiers/2013/16/1366478193-lakebottom-underpass-vallee-de-la-reine-1.jpg", "http://image.noelshack.com/fichiers/2013/16/1366478202-lakebottom-underpass-valee-de-la-reine-2.jpg"},
		/*Upsilon hyperboloïde*/
		{"http://image.noelshack.com/fichiers/2013/19/1368372980-upsilon-hyperboloid-1.jpg", "http://image.noelshack.com/fichiers/2013/19/1368372989-upsilon-hyperboloid-2.jpg"},
		/*Vallon de Cymbel*/
		{"http://image.noelshack.com/fichiers/2013/16/1366453918-cymbel-s-glen-champs-de-ruines.jpg"},
		
		{"null"},
	};
	
	public static String getName(int index){
		return name[index];
	}
	
	public static String[] getFile(int index){
		return file[index];
	}
	
	public static int getSize(){
		return name.length;
	}
}
