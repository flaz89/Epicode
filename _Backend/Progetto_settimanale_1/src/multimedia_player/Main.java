package multimedia_player;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Multimedia datas[] = new Multimedia[5];
		
		
		//intro ------------------------------------------------------------
		System.out.println("Ciao, cosa vuoi riprodurre?\nVideo(1)\nAudio(2)\nImmagine(3)");
		int selector = input.nextInt();
		input.nextLine();
		
		
		//switch per la casistica di selezione; ----------------------------
		String type = "";
		do {
		    switch (selector) {
		        case 1:
		            System.out.println("Hai selezionato il riproduttore Video");
		            type = "Video";
		            break;
		        case 2:
		            System.out.println("Hai selezionato il riproduttore Audio");
		            type = "Audio";
		            break;
		        case 3:
		            System.out.println("Hai selezionato il riproduttore Immagini");
		            type = "Immagine";
		            break;
		        case 0:
		            System.out.println("E' stato un piacere vederti qua, ti aspettiamo presto");
		            break;
		        default:
		            System.out.println("Valore non corretto, devi selezionare Video(1), Audio(2) o Immagine(3)");
		            System.out.println("Seleziona nuovamente: ");
		            selector = input.nextInt();
		            continue;
		    } 
		    break;
		} while (true);

		System.out.println();
		
		
		//for per il popolamento dell'array in base al tipo; ------------------
		
		System.out.println("Cosa vuoi caricare nel tuo riproduttore? aggiungi i dettagli dei tuoi file " + type + "--->");
		System.out.println();
		
		for (int i = 0; i < datas.length; i++) {
			System.out.println();
			System.out.println("-- Inserisci il titolo del tuo file multimediale --");
			String title = input.nextLine();
			
			int time = 0;
			int volume = 0;
			int luminosity = 0;
			
			if (type == "Video" || type == "Audio") {
				System.out.print("Inserisci la durata del tuo file multimediale: ");
				time = input.nextInt();
				input.nextLine();
				
				System.out.print("Inserisci il volume del tuo file multimediale: ");
				volume = input.nextInt();
				input.nextLine();
				
			}
			
			if (type == "Video" || type == "Immagine") {
				System.out.print("Inserisci la luminosità del tuo file multimediale: ");
				luminosity = input.nextInt();
				input.nextLine();
			}
			
			switch (type) {
				case "Video":
					datas[i] = new Video(title, time, volume, luminosity);
					break;
				case "Audio":
					datas[i] = new Audio(title, time, volume);
					break;
				case "Immagine":
					datas[i] = new Image(title, luminosity);
					break;
			}
		}
		System.out.println();
		
		// stampo i dati dell'intero array creato dall'utente ---------------------------
		
		System.out.printf("%-10s %-10s %-10s %-10s%n", "Titolo", "Durata", "Volume", "Luminosità");
		System.out.println("----------------------------------------------");

		for (int i = 0; i < datas.length; i++) {
			Multimedia media = datas[i];
		    System.out.printf("[" + (i + 1) + "]" + "%-10s ", media.getTitle());

		    if (media instanceof Video) {
		        Video video = (Video) media;
		        System.out.printf("%-10d %-10d %-10d%n", video.getTime(), video.getVolume(), video.getLuminosity());
		    } else if (media instanceof Audio) {
		        Audio audio = (Audio) media;
		        System.out.printf("%-10d %-10d %-10s%n", audio.getTime(), audio.getVolume(), "-");
		    } else if (media instanceof Image) {
		        Image image = (Image) media;
		        System.out.printf("%-10s %-10s %-10d%n", "-", "-", image.getLuminosity());
		    }
		}
		System.out.println();
		
		// riproduzione degli elementi caricati ---------------------------

		int inputPlayer;
		do {
            System.out.print("Inserisci il numero dell'elemento da eseguire (0 per terminare): ");
            inputPlayer = input.nextInt();
            input.nextLine();

            if (inputPlayer >= 1 && inputPlayer <= 5) {
                Multimedia media = datas[inputPlayer - 1];
                
                // ------------------- MEDIA
                if (media instanceof Image) {
                    ((Image) media).show();
                    
                    System.out.println("Vuoi alzare o abbassare la luminosità? y/n");
                    
                    String changeLuminosity = input.nextLine();
                    
                    if (changeLuminosity.equals("y")) {
                    	System.out.println("Alza la luminosità con '+' o abbassala con '-':");
                    	String turnUp = input.nextLine();
                    	if (turnUp.equals("+")) {
                    		((Image) media).highLuminosity();
                    	} else if (turnUp.equals("-")) {
                    		((Image) media).lowLuminosity();
                    	} else {
                    	System.out.println("Seleziona l'input corretto");
                    	} 
                   }
                    
                 // ------------------- AUDIO
                } else if (media instanceof Audio) {
                    ((Audio) media).play();
                    
                    System.out.println("Vuoi alzare il alzare o abbassare il volume? y/n");
                    
                    String changeVolume = input.nextLine();
                    
                    if (changeVolume.equals("y")) {
                    	System.out.println("Alza il volume con '+' o abbassala con '-':");
                    	String turnUp = input.nextLine();
                    	if (turnUp.equals("+")) {
                    		((Audio) media).highLuminosity();
                    	} else if (turnUp.equals("-")) {
                    		((Audio) media).lowLuminosity();
                    	} else {
                    	System.out.println("Seleziona l'input corretto");
                    	}
                    }
                    	
                 // ------------------- VIDEO
                } else if (media instanceof Video) {
                	((Video) media).play();
                	
                	System.out.println("Vuoi alzare/abbassare la luminosità (l) o vuoi alzare o abbassare il volume (v)?");
                    
                    String changeVolumeLuminosity = input.nextLine();
                    
                    if (changeVolumeLuminosity.equals("l")) {
                    	System.out.println("Alza la luminosità con '+' o abbassala con '-':");
                    	String turnUp = input.nextLine();
                    	if (turnUp.equals("+")) {
                    		((Video) media).highLuminosity();
                    	} else if (turnUp.equals("-")) {
                    		((Video) media).lowLuminosity();
                    	} else {
                    	System.out.println("Seleziona l'input corretto");
                    	}
                    } else if (changeVolumeLuminosity.equals("v")) {
                    	System.out.println("Alza il volume con '+' o abbassa con '-':");
                    	String turnUp = input.nextLine();
                    	if (turnUp.equals("+")) {
                    		((Video) media).highVolume();
                    	} else if (turnUp.equals("-")) {
                    		((Video) media).lowVolume();
                    	} else {
                    	System.out.println("Seleziona l'input corretto");
                    	}
                    }
                }
            }
        } while (inputPlayer != 0);

        input.close();

	}

}
