package shoe_showroom;

import java.util.Scanner;

import java.util.Scanner;

public class p4
{

	static
	{
		System.out.println("welcome to shoe shopee at thane");
	}

	public static void main(String[] args) {

		men m = new men();
		women w = new women();
		System.out.println("please Select your Gender");

		System.out.println("select 1.for Men,2.for Women");

		Scanner sc = new Scanner(System.in);

		int sel = sc.nextInt();
		switch (sel) {
		case 1:
			m.menShoes();
			break;
		case 2:
			w.womenShoes();
			break;

		default:
			System.out.println("please select appropriate number");

			System.out.println("select 1.for Men,2.for Women");

			int sel1 = sc.nextInt();

			switch (sel) {
			case 1:
				m.menShoes();
				break;
			case 2:
				w.womenShoes();
				break;
			}
			break;
		}
		Scanner s=new Scanner (System.in);
		Scanner s1=new Scanner (System.in);
		System.out.println("Please enter your Name :");
		String Name=s.nextLine();
		System.out.println();
		
		System.out.println("Please enter your Mobile Number :");
		int Mob=s.nextInt(10);
		System.out.println();
		
		System.out.println("Please enter your Address :");
		String Address=s1.nextLine();
		System.out.println();
		
		 Details de=new Details();
		 System.out.println("Your Details: ");
    	 de.setName(Name);
    	 System.out.println();
    	 System.out.println("Name: "+de.getName());
    	
    	 de.setMob(Mob);
    	 System.out.println("Mobile Number: "+de.getMob());
    	
    	 de.setadd(Address);
    	 System.out.println("Address: "+de.getAddress());
    	 System.out.println();
    	 
    	 System.out.println();
    	 System.out.println("Thanks for purchase, please visit again!!");
	}
}

class men {
	public static void menShoes() {
		System.out.println("please select the desired company");

		System.out.println("select 1. for nike,2.for addidas,3.for puma,4.for red cheif");
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		switch (inp) {
		case 1:
			System.out.println("Select 1.for sneakers,2.for loafers,3.for formals,4. for flipflops ");
			nike();
			break;
		case 2:
			System.out.println("Select 1.for sneakers,2.for loafers,3.for formals,4. for flipflops ");
			adidas();
			break;
		case 3:
			System.out.println("Select 1.for sneakers,2.for loafers,3.for formals,4. for flipflops ");
			puma();
			break;
		case 4:
			System.out.println("Select 1.for sneakers,2.for loafers,3.for formals,4. for flipflops ");
			redCheif();
			break;
		default:
			System.out.println("inappropriate selection");
			System.out.println("please select the desired company");
			System.out.println("select 1. for nike,2.for addidas,3.for puma,4.for red cheif");
			int inp1 = sc.nextInt();
			switch (inp1) {
			case 1:
				System.out.println("Select 1.for sneakers,2.for loafers,3.for formals,4. for flipflops ");
				nike();
				break;
			case 2:
				System.out.println("Select 1.for sneakers,2.for loafers,3.for formals,4. for flipflops ");
				adidas();
				break;
			case 3:
				System.out.println("Select 1.for sneakers,2.for loafers,3.for formals,4. for flipflops ");
				puma();
				break;
			case 4:
				System.out.println("Select 1.for sneakers,2.for loafers,3.for formals,4. for flipflops ");
				redCheif();
				break;
			}
			break;
		}}
	public static void nike() {
		Scanner sc=new Scanner(System.in);
		int inp3=sc.nextInt();
		switch(inp3) {
		case 1:
			System.out.println("select 1.for Air_jordan_Low_se_1, 2.for Nike_dunk_high_retro, 3.for Nike_airforce_1");
			int inp4=sc.nextInt();
			switch(inp4) {
			case 1: Air_jordan_Low_se_1();
				break;
			case 2: Nike_dunk_high_retro();
			break;
			case 3: Nike_airforce_1();
			break;
			default:System.out.println("Selected wrong option please select right option");
			int inp5=sc.nextInt();
			switch(inp5) {
			case 1: Air_jordan_Low_se_1();
			break;
		case 2: Nike_dunk_high_retro();
		break;
		case 3: Nike_airforce_1();
		break;
			}
			break;
			}
		break;
		case 2:
			System.out.println("select 1.for Nike_black_zoom, 2.for burrow_loafers, 3.for Black_toki");
			int inp6=sc.nextInt();
			switch(inp6) {
			case 1: Nike_black_zoom();
				break;
			case 2:  burrow_loafers();
			break;
			case 3: Black_toki();
			break;
			default:System.out.println("Selected wrong option please select right option");
			int inp5=sc.nextInt();
			switch(inp5) {
			case 1: Nike_black_zoom();
			break;
		case 2:  burrow_loafers();
		break;
		case 3: Black_toki();
		break;
			}
			break;
			}
			break;
		case 3:
			System.out.println("Select 1.for formals");
			int inp7=sc.nextInt();
			switch(inp7) {
			case 1: Formals();
				break;
			default:System.out.println("Selected wrong option please select right option");
			int inp5=sc.nextInt();
			switch(inp5) {
			case 1: Formals();
			break;
			}
			break;
			}
			break;
		case 4:
			System.out.println("Select 1.for Nike_Offcourt,2.for Nike_victori_one,3.for Nike_Air_max_90");
			int inp8=sc.nextInt();
			switch(inp8) {
			case 1: Nike_Offcourt();
				break;
			case 2: Nike_victori_one();
			break;
			case 3: Nike_Air_max_90();
			break;
			default:System.out.println("Selected wrong option please select right option");
			int inp5=sc.nextInt();
			switch(inp5) {
			case 1: Nike_Offcourt();
			break;
		case 2: Nike_victori_one();
		break;
		case 3: Nike_Air_max_90();
		break;
			}
			break;
			}
			break;
			default:System.out.println("inappropriate selection");
			System.out.println("please select the desired option");
			System.out.println("Select 1.for sneakers,2.for loafers,3.for formals,4. for flipflops ");
			int inp1 = sc.nextInt();
			switch (inp1) {
			case 1:
				System.out.println("select 1.for Air_jordan_Low_se_1, 2.for Nike_dunk_high_retro, 3.for Nike_airforce_1");
				int in4=sc.nextInt();
				switch(in4) {
				case 1: Air_jordan_Low_se_1();
					break;
				case 2: Nike_dunk_high_retro();
				break;
				case 3: Nike_airforce_1();
				break;
				default:System.out.println("Selected wrong option please select right option");
				int inp5=sc.nextInt();
				switch(inp5) {
				case 1: Air_jordan_Low_se_1();
				break;
			case 2: Nike_dunk_high_retro();
			break;
			case 3: Nike_airforce_1();
			break;
				}
				break;
				}
			break;
			case 2:
				System.out.println("select 1.for Nike_black_zoom, 2.for burrow_loafers, 3.for Black_toki");
				int in6=sc.nextInt();
				switch(in6) {
				case 1: Nike_black_zoom();
					break;
				case 2:  burrow_loafers();
				break;
				case 3: Black_toki();
				break;
				default:System.out.println("Selected wrong option please select right option");
				int inp5=sc.nextInt();
				switch(inp5) {
				case 1: Nike_black_zoom();
				break;
			case 2:  burrow_loafers();
			break;
			case 3: Black_toki();
			break;
				}
				break;
				}
				break;
			case 3:
				System.out.println("Select 1.for formals");
				int in7=sc.nextInt();
				switch(in7) {
				case 1: Formals();
					break;
				default:System.out.println("Selected wrong option please select right option");
				int inp5=sc.nextInt();
				switch(inp5) {
				case 1: Formals();
				break;
				}
				break;
				}
				break;
			case 4:
				System.out.println("Select 1.for Nike_Offcourt,2.for Nike_victori_one,3.for Nike_Air_max_90");
				int in8=sc.nextInt();
				switch(in8) {
				case 1: Nike_Offcourt();
					break;
				case 2: Nike_victori_one();
				break;
				case 3: Nike_Air_max_90();
				break;
				default:System.out.println("Selected wrong option please select right option");
				int inp5=sc.nextInt();
				switch(inp5) {
				case 1: Nike_Offcourt();
				break;
			case 2: Nike_victori_one();
			break;
			case 3: Nike_Air_max_90();
			break;
				}
				break;
				}
				break;
			}
		}
		
	}
	public static void adidas() {
		Scanner sc=new Scanner(System.in);
		int inp3=sc.nextInt();
		switch(inp3) {
		case 1:
			System.out.println("select 1.for Busentiz_shoes, 2.for Superstar, 3.for ADIFOM_SLTN_SHOES");
			int inp1=sc.nextInt();
			switch(inp1) {
			case 1: Busentiz_shoes();
				break;
			case 2: Superstar();
			break;
			case 3: ADIFOM_SLTN_SHOES();
			break;
			default:System.out.println("Selected wrong option please select right option");
			int inp5=sc.nextInt();
			switch(inp5) {
			case 1: Busentiz_shoes();
			break;
		case 2: Superstar();
		break;
		case 3:ADIFOM_SLTN_SHOES();
		break;
			}
			break;
			}
		break;
		case 2:
			System.out.println("select 1.for loafers");
			int inp4=sc.nextInt();
			switch(inp4) {
			case 1: loafers();
				break;
			default:System.out.println("Selected wrong option please select right option");
			int inp5=sc.nextInt();
			switch(inp5) {
			case 1: loafers();
			break;
			}
			break;
			}
			break;
		case 3:
			System.out.println("Select 1.for formals");
			int inp5=sc.nextInt();
			switch(inp5) {
			case 1: a_formals();
				break;
			default:System.out.println("Selected wrong option please select right option");
			int inp7=sc.nextInt();
			switch(inp7) {
			case 1: a_formals();
			break;
			}
			break;
			}
			break;
		case 4:
			System.out.println("Select 1.for SLALON_SLIPPERS,2.for Eezay_Slide_Sandal,3.for comfort_flip_flops");
			int inp6=sc.nextInt();
			switch(inp6) {
			case 1: SLALON_SLIPPERS();
				break;
			case 2: Eezay_Slide_Sandal();
			break;
			case 3: comfort_flip_flops();
			break;
			default:System.out.println("Selected wrong option please select right option");
			int inp7=sc.nextInt();
			switch(inp7) {
			case 1: SLALON_SLIPPERS();
			break;
		case 2: Eezay_Slide_Sandal();
		break;
		case 3: comfort_flip_flops();
		break;
			}
			break;
			}
			break;
		default:System.out.println("inappropriate selection");
			System.out.println("please select the desired option");
			System.out.println("Select 1.for sneakers,2.for loafers,3.for formals,4. for flipflops ");
			int inp2 = sc.nextInt();
			switch (inp2) {
			case 1:
				System.out.println("select 1.for Busentiz_shoes, 2.for Superstar, 3.for ADIFOM_SLTN_SHOES");
				int ip1=sc.nextInt();
				switch(ip1) {
				case 1: Busentiz_shoes();
					break;
				case 2: Superstar();
				break;
				case 3: ADIFOM_SLTN_SHOES();
				break;
				default:System.out.println("Selected wrong option please select right option");
				int ip5=sc.nextInt();
				switch(ip5) {
				case 1: Busentiz_shoes();
				break;
			case 2: Superstar();
			break;
			case 3:ADIFOM_SLTN_SHOES();
			break;
				}
				break;
				}
			break;
			case 2:
				System.out.println("select 1.for loafers");
				int ip4=sc.nextInt();
				switch(ip4) {
				case 1: loafers();
					break;
				default:System.out.println("Selected wrong option please select right option");
				int ip5=sc.nextInt();
				switch(ip5) {
				case 1: loafers();
				break;
				}
				break;
				}
				break;
			case 3:
				System.out.println("Select 1.for formals");
				int ip5=sc.nextInt();
				switch(ip5) {
				case 1: a_loafers();
					break;
				default:System.out.println("Selected wrong option please select right option");
				int inp7=sc.nextInt();
				switch(inp7) {
				case 1: a_loafers();
				break;
				}
				break;
				}
				break;
			case 4:
				System.out.println("Select 1.for SLALON_SLIPPERS,2.for Eezay_Slide_Sandal,3.for comfort_flip_flops");
				int ip6=sc.nextInt();
				switch(ip6) {
				case 1: SLALON_SLIPPERS();
					break;
				case 2: Eezay_Slide_Sandal();
				break;
				case 3: comfort_flip_flops();
				break;
				default:System.out.println("Selected wrong option please select right option");
				int inp7=sc.nextInt();
				switch(inp7) {
				case 1: SLALON_SLIPPERS();
				break;
			case 2: Eezay_Slide_Sandal();
			break;
			case 3: comfort_flip_flops();
			break;
				}
				break;
				}
				break;
		
			}
		}
	}
	private static void a_loafers() {
		System.out.println("No loafers for adidas");
	}
	public static void puma() {
		Scanner sc=new Scanner(System.in);
		int inp3=sc.nextInt();
		switch(inp3) {
		case 1:
			System.out.println("select 1.for RSX_SPLIt, 2.for Minecraft_City_Rider_Sneakers, 3.for Porsche_Legacy_RDG_Cat_Motorsport");
			int ip6=sc.nextInt();
			switch(ip6) {
			case 1: RSX_SPLIt();
				break;
			case 2: Minecraft_City_Rider_Sneakers();
			break;
			case 3: Porsche_Legacy_RDG_Cat_Motorsport();
			break;
			default:System.out.println("Selected wrong option please select right option");
			int inp7=sc.nextInt();
			switch(inp7) {
			case 1: RSX_SPLIt();
			break;
		case 2: Minecraft_City_Rider_Sneakers();
		break;
		case 3: Porsche_Legacy_RDG_Cat_Motorsport();
		break;
			}
			break;
			}
			break;
		case 2:
			System.out.println("select 1.for Puma_Loafers");
			int ip5=sc.nextInt();
			switch(ip5) {
			case 1: Puma_Loafers();
				break;
			default:System.out.println("Selected wrong option please select right option");
			int inp7=sc.nextInt();
			switch(inp7) {
			case 1: Puma_Loafers();
			break;
			}
			break;
			}
			break;
		case 3:
			System.out.println("Select 1.for Puma_formals");
			int ip4=sc.nextInt();
			switch(ip4) {
			case 1: puma_formals();
				break;
			default:System.out.println("Selected wrong option please select right option");
			int inp7=sc.nextInt();
			switch(inp7) {
			case 1: puma_formals();
			break;
			}
			break;
			}
			break;
		case 4:
			System.out.println("Select 1.for comfy_v2,2.for Felic_Slippers,3.for wick_slippers");
			int ip3=sc.nextInt();
			switch(ip3) {
			case 1: comfy_v2();
				break;
			case 2: Felic_Slippers();
			break;
			case 3: wick_slippers();
			break;
			default:System.out.println("Selected wrong option please select right option");
			int inp7=sc.nextInt();
			switch(inp7) {
			case 1: comfy_v2();
			break;
		case 2: Felic_Slippers();
		break;
		case 3: wick_slippers();
		break;
			}
			break;
			}
			break;
			default:System.out.println("inappropriate selection");
			System.out.println("please select the desired option");
			System.out.println("Select 1.for sneakers,2.for loafers,3.for formals,4. for flipflops ");
			int inp1 = sc.nextInt();
			switch (inp1) {
			case 1:
				System.out.println("select 1.for RSX_SPLIt, 2.for Minecraft_City_Rider_Sneakers, 3.for Porsche_Legacy_RDG_Cat_Motorsport");
				int in6=sc.nextInt();
				switch(in6) {
				case 1: RSX_SPLIt();
					break;
				case 2: Minecraft_City_Rider_Sneakers();
				break;
				case 3: Porsche_Legacy_RDG_Cat_Motorsport();
				break;
				default:System.out.println("Selected wrong option please select right option");
				int inp7=sc.nextInt();
				switch(inp7) {
				case 1: RSX_SPLIt();
				break;
			case 2: Minecraft_City_Rider_Sneakers();
			break;
			case 3: Porsche_Legacy_RDG_Cat_Motorsport();
			break;
				}
				break;
				}
				break;
			case 2:
				System.out.println("select 1.for Puma_Loafers");
				int in5=sc.nextInt();
				switch(in5) {
				case 1: Puma_Loafers();
					break;
				default:System.out.println("Selected wrong option please select right option");
				int inp7=sc.nextInt();
				switch(inp7) {
				case 1: Puma_Loafers();
				break;
				}
				break;
				}
				break;
			case 3:
				System.out.println("Select 1.for Puma_formals");
				int in4=sc.nextInt();
				switch(in4) {
				case 1: puma_formals();
					break;
				default:System.out.println("Selected wrong option please select right option");
				int inp7=sc.nextInt();
				switch(inp7) {
				case 1: puma_formals();
				break;
				}
				break;
				}
				break;
			case 4:
				System.out.println("Select 1.for comfy_v2,2.for Felic_Slippers,3.for wick_slippers");
				int in3=sc.nextInt();
				switch(in3) {
				case 1: comfy_v2();
					break;
				case 2: Felic_Slippers();
				break;
				case 3: wick_slippers();
				break;
				default:System.out.println("Selected wrong option please select right option");
				int inp7=sc.nextInt();
				switch(inp7) {
				case 1: comfy_v2();
				break;
			case 2: Felic_Slippers();
			break;
			case 3: wick_slippers();
			break;
				}
				break;
				}
				break;
		
			}
		}
	}
	public static void redCheif() {
		Scanner sc=new Scanner(System.in);
		int inp3=sc.nextInt();
		switch(inp3) {
		case 1:
			System.out.println("select 1.for Rust_Casual_Shoes, 2.for white_sneaker, 3.for Blue_sneaker");
			int in3=sc.nextInt();
			switch(in3) {
			case 1: Rust_Casual_Shoes();
				break;
			case 2: white_sneaker();
			break;
			case 3: Blue_sneaker();
			break;
			default:System.out.println("Selected wrong option please select right option");
			int inp7=sc.nextInt();
			switch(inp7) {
			case 1: Rust_Casual_Shoes();
			break;
		case 2: white_sneaker();
		break;
		case 3: Blue_sneaker();
		break;
			}
			break;
			}
			break;
		case 2:
			System.out.println("select 1.for boat_shoes, 2.for Leather_formal, 3.for Boat_shoe_2");
			int in2=sc.nextInt();
			switch(in2) {
			case 1: boat_shoes();
				break;
			case 2: Leather_formal();
			break;
			case 3: Boat_shoe_2();
			break;
			default:System.out.println("Selected wrong option please select right option");
			int inp7=sc.nextInt();
			switch(inp7) {
			case 1: boat_shoes();
			break;
		case 2: Leather_formal();
		break;
		case 3: Boat_shoe_2();
		break;
			}
			break;
			}
			break;
		case 3:
			System.out.println("Select 1.for Formal_Oxford_Shoe, 2.for RC1090, 3.for Derby_Formal_Shoes9");
			int in1=sc.nextInt();
			switch(in1) {
			case 1: Formal_Oxford_Shoe();
				break;
			case 2: RC1090();
			break;
			case 3: Derby_Formal_Shoes9();
			break;
			default:System.out.println("Selected wrong option please select right option");
			int inp7=sc.nextInt();
			switch(inp7) {
			case 1: Formal_Oxford_Shoe();
			break;
		case 2: RC1090();
		break;
		case 3: Derby_Formal_Shoes9();
		break;
			}
			break;
			}
			break;
		case 4:
			System.out.println("Select 1.for flipflops ");
			int in4=sc.nextInt();
			switch(in4) {
			case 1: flipflops_();
				break;
			default:System.out.println("Selected wrong option please select right option");
			int inp7=sc.nextInt();
			switch(inp7) {
			case 1: flipflops_();
			break;
			}
			break;
			}
			break;
			default:System.out.println("inappropriate selection");
			System.out.println("please select the desired option");
			System.out.println("Select 1.for sneakers,2.for loafers,3.for formals,4. for flipflops ");
			int inp1 = sc.nextInt();
			switch (inp1) {
			case 1:
				System.out.println("select 1.for Rust_Casual_Shoes, 2.for white_sneaker, 3.for Blue_sneaker");
				int ip3=sc.nextInt();
				switch(ip3) {
				case 1: Rust_Casual_Shoes();
					break;
				case 2: white_sneaker();
				break;
				case 3: Blue_sneaker();
				break;
				default:System.out.println("Selected wrong option please select right option");
				int inp7=sc.nextInt();
				switch(inp7) {
				case 1: Rust_Casual_Shoes();
				break;
			case 2: white_sneaker();
			break;
			case 3: Blue_sneaker();
			break;
				}
				break;
				}
				break;
			case 2:
				System.out.println("select 1.for boat_shoes, 2.for Leather_formal, 3.for Boat_shoe_2");
				int ip2=sc.nextInt();
				switch(ip2) {
				case 1: boat_shoes();
					break;
				case 2: Leather_formal();
				break;
				case 3: Boat_shoe_2();
				break;
				default:System.out.println("Selected wrong option please select right option");
				int inp7=sc.nextInt();
				switch(inp7) {
				case 1: boat_shoes();
				break;
			case 2: Leather_formal();
			break;
			case 3: Boat_shoe_2();
			break;
				}
				break;
				}
				break;
			case 3:
				System.out.println("Select 1.for Formal_Oxford_Shoe, 2.for RC1090, 3.for Derby_Formal_Shoes9");
				int ip1=sc.nextInt();
				switch(ip1) {
				case 1: Formal_Oxford_Shoe();
					break;
				case 2: RC1090();
				break;
				case 3: Derby_Formal_Shoes9();
				break;
				default:System.out.println("Selected wrong option please select right option");
				int inp7=sc.nextInt();
				switch(inp7) {
				case 1: Formal_Oxford_Shoe();
				break;
			case 2: RC1090();
			break;
			case 3: Derby_Formal_Shoes9();
			break;
				}
				break;
				}
				break;
			case 4:
				System.out.println("Select 1.for flipflops ");
				int ip4=sc.nextInt();
				switch(ip4) {
				case 1: flipflops_();
					break;
				default:System.out.println("Selected wrong option please select right option");
				int inp7=sc.nextInt();
				switch(inp7) {
				case 1: flipflops_();
				break;
				}
				break;
				}
				break;
			}
		}
	}
	
	
	public static void Air_jordan_Low_se_1() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Air_jordan_Low_se_1");
		System.out.println("Price-9695/- Rupees only");
		System.out.println("Benefits-Genuine and synthetic leather in the upper provide premium durability");

		System.out.println("Type size");
		int user_size = sc.nextInt();

		int[] size_available = { 8, 9, 10, 12 };

		if (user_size == size_available[0] || user_size == size_available[1] || user_size == size_available[2]
				|| user_size == size_available[3]) {
			System.out.println("size is available");

		} else {
			System.out.println("oops,size is not available please try another one");
			int user_size1 = sc.nextInt();
			if (user_size1 == size_available[0] || user_size1 == size_available[1] || user_size1 == size_available[2]
					|| user_size1 == size_available[3]) {
				System.out.println("size is available");

			} else {
				System.out.println("Please visit our place for better options!!");
							}
		}

		System.out.println("Select desired colour - Black,White");
		String user_colour = sc.nextLine();

		String[] colour_available = { "White", "Black" };

		if (user_colour.equalsIgnoreCase(colour_available[0]) || user_colour.equalsIgnoreCase(colour_available[1])) {
			System.out.println("wow!!Nice choice");
		} else {
			System.out.println("oops,colours is not available please try another one");
			String user_colour1 = sc.next();
			if (user_colour1.equalsIgnoreCase(colour_available[0]) || user_colour1.equalsIgnoreCase(colour_available[1])) {
				System.out.println("wow!!Nice choice");
			} else {
				System.out.println("Please visit our place for better options!!");
					}
		}
	}

	public static void Nike_dunk_high_retro()

	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Price-11295/- Rupees only");
		System.out.println("Benefits-vintage style looks,with more comfort and durability");

		System.out.println("Type size");
		int user_size = sc.nextInt();

		int[] size_available = { 9, 10, 12 };

		if (user_size == size_available[0] || user_size == size_available[1] || user_size == size_available[2]) {
			System.out.println("size is available");
		} else {
			System.out.println("oops,size is not available please try another one");
			int user_size1 = sc.nextInt();
			if (user_size1 == size_available[0] || user_size1 == size_available[1] || user_size1 == size_available[2]) {
				System.out.println("size is available");
				}else {
					System.out.println("Please visit our place for better options!!");
				}
		}

		System.out.println("Select desired colour - Grey,Orange");
		String usercolour = sc.next();

		String[] colour_available = { "Grey", "Orange" };
		if (usercolour.equalsIgnoreCase(colour_available[0]) || usercolour.equalsIgnoreCase(colour_available[1])) {
			System.out.println("nice choice!!");
		} else {
			System.out.println("oops,colours is not available please try another one");
			String usercolour1 = sc.next();
			if (usercolour1.equalsIgnoreCase(colour_available[0]) || usercolour1.equalsIgnoreCase(colour_available[1])) {
				System.out.println("nice choice!!");
			} else {
				System.out.println("Please visit our place for better options!!");
					}
		}

	}

	public static void Nike_airforce_1() {
		Scanner sc = new Scanner(System.in);

		System.out.println("price-8985/- rupees only");
		System.out.println("Benefits-crisp leather, clean colourways and the perfect amount of flash to make you shine.");

		System.out.println("Type size");
		int user_size = sc.nextInt();

		int[] available_size = { 9, 10 };
		if (user_size == available_size[0] || user_size == available_size[1]) {
			System.out.println("size is available");
		} else {
			System.out.println("oops,size is not available please try another one");
			int user_size1 = sc.nextInt();
			if (user_size1 == available_size[0] || user_size1 == available_size[1]) {
				System.out.println("size is available");
			} else {
				System.out.println("Please visit our place for better options!!");
					}
		}

		System.out.println("Select desired colour- White");
		String usercolour = sc.next();

		String[] colour_available = { "White" };
		if (usercolour.equalsIgnoreCase(colour_available[0])) {
			System.out.println("nice choice!!");
		} else {
			System.out.println("oops,colours is not available please try another one");
			String usercolour1 = sc.next();
			if (usercolour1.equalsIgnoreCase(colour_available[0])) {
				System.out.println("nice choice!!");
			} else {
				System.out.println("Please visit our place for better options!!");
					}
		}

	}

	// loafers of nike
	public static void Nike_black_zoom() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Price-6796/- rupees only");
		System.out.println("Benefits-Upper cushioned footbed Textured and patterned outsole");

		System.out.println("type size");
		int user_size = sc.nextInt();

		int[] available_size = { 8, 9, 10 };
		if (user_size == available_size[0] || user_size == available_size[1] || user_size == available_size[2]) {
			System.out.println("size is available");
		} else {
			System.out.println("oops,size is not available please try another one");
			int user_size1 = sc.nextInt();
			if (user_size1 == available_size[0] || user_size1 == available_size[1] || user_size1 == available_size[2]) {
				System.out.println("size is available");
			} else {
				System.out.println("Please visit our place for better options!!");
					}
		}

		System.out.println("Select desired colour-Black");
		String usercolour = sc.next();

		String[] colour_available = { "Black" };
		if (usercolour.equalsIgnoreCase(colour_available[0])) {
			System.out.println("nice choice!!");
		} else {
			System.out.println("oops,colours is not available please try another one");
			String usercolour1 = sc.next();
			if (usercolour1.equalsIgnoreCase(colour_available[0])) {
				System.out.println("nice choice!!");
			} else {
				System.out.println("Please visit our place for better options!!");
					}
		}
	}

	public static void burrow_loafers() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Price-4991/- Rupees only");
		System.out.println("Benefits-Its fleece-like lining helps keep you warm.");

		System.out.println("type size");
		int user_size = sc.nextInt();

		int[] available_size = { 8, 9, 10 };
		if (user_size == available_size[0] || user_size == available_size[1] || user_size == available_size[2]) {
			System.out.println("size is available");
		} else {
			System.out.println("oops,size is not available please try another one");
			int user_size1 = sc.nextInt();
			if (user_size1 == available_size[0] || user_size1 == available_size[1] || user_size1 == available_size[2]) {
				System.out.println("size is available");
			} else {
				System.out.println("Please visit our place for better options!!");
				}
		}

		System.out.println("Select desired colour-Black,Brown");
		String usercolour = sc.next();

		String[] colour_available = { "Black","Brown" };
		if (usercolour.equalsIgnoreCase(colour_available[0]) || usercolour.equalsIgnoreCase(colour_available[1])) {
			System.out.println("nice choice!!");
		} else {
			System.out.println("oops,colours is not available please try another one");
			String usercolour1 = sc.next();
			if (usercolour1.equalsIgnoreCase(colour_available[0]) || usercolour1.equalsIgnoreCase(colour_available[1])) {
				System.out.println("nice choice!!");
			} else {
				System.out.println("Please visit our place for better options!!");
					}
		}

	}

	public static void Black_toki() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Price-4495/- Rupees only");
		System.out.println("Benefits-has elasticated gussets on the midfoot Cushioned footbed");

		System.out.println("Type size");
		int user_size = sc.nextInt();

		int[] available_size = { 8, 9, 10, 12 };
		if (user_size == available_size[0] || user_size == available_size[1] || user_size == available_size[2]
				|| user_size == available_size[3]) {
			System.out.println("size is available");
		} else {
			System.out.println("oops,size is not available please try another one");
			int user_size1 = sc.nextInt();
			if (user_size1 == available_size[0] || user_size1 == available_size[1] || user_size1 == available_size[2]
					|| user_size1 == available_size[3]) {
				System.out.println("size is available");
			} else {
				System.out.println("Please visit our place for better options!!");
					}
		}

		System.out.println("Select desired colour-Black");
		String usercolour = sc.next();

		String[] colour_available = { "Black" };
		if (usercolour.equalsIgnoreCase(colour_available[0])) {
			System.out.println("nice choice!!");
		} else {
			System.out.println("oops,colours is not available please try another one");
			String usercolour1 = sc.next();
			if (usercolour1.equalsIgnoreCase(colour_available[0])) {
				System.out.println("nice choice!!");
			} else {
				System.out.println("Please visit our place for better options!!");
					}
		}
	}

//formals of nike
	public static void Formals() {
		System.out.println("sorry no formal shoes for nike");
	}

//flipflops for nike
	public static void Nike_Offcourt() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Price-2495/- Rupees only");
		System.out.println(
				"Benefits-Innovative dual-layered foam underfoot pairs with a plush strap to bring the comfort,");

		System.out.println("Type size");
		int user_size = sc.nextInt();

		int[] available_size = { 6, 7, 8, 9, 10, 12 };
		if (user_size == available_size[0] || user_size == available_size[1] || user_size == available_size[2]
				|| user_size == available_size[3] || user_size == available_size[4] || user_size == available_size[5]) {
			System.out.println("size is available");
		} else {
			System.out.println("oops,size is not available please try another one");
			int user_size1 = sc.nextInt();
			if (user_size1 == available_size[0] || user_size1 == available_size[1] || user_size1 == available_size[2]
					|| user_size1 == available_size[3] || user_size1 == available_size[4] || user_size1 == available_size[5]) {
				System.out.println("size is available");
			} else {
				System.out.println("Please visit our place for better options!!");
				}
		}

		System.out.println("Select desired colour-White,Orange,Black,Offwhite");
		String usercolour = sc.next();

		String[] colour_available = { "White","Orange","Black","Offwhite" };
		if (usercolour.equalsIgnoreCase(colour_available[0]) || usercolour.equalsIgnoreCase(colour_available[1])
				|| usercolour.equalsIgnoreCase(colour_available[2])
				|| usercolour.equalsIgnoreCase(colour_available[3])) {
			System.out.println("nice choice!!");
		} else {
			System.out.println("oops,colours is not available please try another one");
			String usercolour1 = sc.next();
			if (usercolour1.equalsIgnoreCase(colour_available[0]) || usercolour1.equalsIgnoreCase(colour_available[1])
					|| usercolour1.equalsIgnoreCase(colour_available[2])
					|| usercolour1.equalsIgnoreCase(colour_available[3])) {
				System.out.println("nice choice!!");
			} else {
				System.out.println("Please visit our place for better options!!");
					}
		}
	}

	public static void Nike_victori_one() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Price-2595/- Rupees only");
		System.out.println(
				"Benefits-features new, softer foam that feels comfortable while the contoured footbed with grip. ");

		System.out.println("Type size");
		int user_size = sc.nextInt();

		int[] available_size = { 7, 8, 9, 10, 12 };
		if (user_size == available_size[0] || user_size == available_size[1] || user_size == available_size[2]
				|| user_size == available_size[3] || user_size == available_size[4]) {
			System.out.println("size is available");
		} else {
			System.out.println("oops,size is not available please try another one");
			int user_size1 = sc.nextInt();
			if (user_size1 == available_size[0] || user_size1 == available_size[1] || user_size1 == available_size[2]
					|| user_size1 == available_size[3] || user_size1 == available_size[4]) {
				System.out.println("size is available");
			} else {
				System.out.println("Please visit our place for better options!!");
				}

		}

		System.out.println("Select desired colour-White,Red,Black,Orange");
		String usercolour = sc.next();

		String[] colour_available = { "White","Orange","Black","red" };
		if (usercolour.equalsIgnoreCase(colour_available[0]) || usercolour.equalsIgnoreCase(colour_available[1])
				|| usercolour.equalsIgnoreCase(colour_available[2])
				|| usercolour.equalsIgnoreCase(colour_available[3])) {
			System.out.println("nice choice!!");
		} else {
			System.out.println("oops,colours is not available please try another one");
			String usercolour1 = sc.next();
			if (usercolour1.equalsIgnoreCase(colour_available[0]) || usercolour1.equalsIgnoreCase(colour_available[1])
					|| usercolour1.equalsIgnoreCase(colour_available[2])
					|| usercolour1.equalsIgnoreCase(colour_available[3])) {
				System.out.println("nice choice!!");
			} else {
				System.out.println("Please visit our place for better options!!");
				}
		}
	}

	public static void Nike_Air_max_90() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Price-5995/- Rupees only");
		System.out.println("Benefits-The foam footbed and plush strap lining offer comfort and support.");

		System.out.println("Type size");
		int user_size = sc.nextInt();

		int[] available_size = { 5, 6, 7, 8, 9, 10, 12 };
		if (user_size == available_size[0] || user_size == available_size[1] || user_size == available_size[2]
				|| user_size == available_size[3] || user_size == available_size[4] || user_size == available_size[6]
				|| user_size == available_size[5]) {
			System.out.println("size is available");
		} else {
			System.out.println("oops,size is not available please try another one");
			int user_size1 = sc.nextInt();
			if (user_size1 == available_size[0] || user_size1 == available_size[1] || user_size1 == available_size[2]
					|| user_size1 == available_size[3] || user_size1 == available_size[4] || user_size1 == available_size[6]
					|| user_size1 == available_size[5]) {
				System.out.println("size is available");
			} else {
				System.out.println("Please visit our place for better options!!");
					}
		}

		System.out.println("Select desired colour-White,Black");
		String usercolour = sc.next();

		String[] colour_available = { "White","Black" };
		if (usercolour.equalsIgnoreCase(colour_available[0]) || usercolour.equalsIgnoreCase(colour_available[1])) {
			System.out.println("nice choice!!");
		} else {
			System.out.println("oops,colours is not available please try another one");
			String usercolour1 = sc.next();
			if (usercolour1.equalsIgnoreCase(colour_available[0]) || usercolour1.equalsIgnoreCase(colour_available[1])) {
				System.out.println("nice choice!!");
			} else {
				System.out.println("Please visit our place for better options!!");
			}
		}
	}

	public static void Busentiz_shoes() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Price-60195/- Rupees only");
		System.out.println("Benefits-flexible cupsole, moulded Adiprene sockliner and Geofit collar.");

		System.out.println("Type size");
		int user_size = sc.nextInt();

		int[] available_size = { 8, 9, 10, 12 };
		if (user_size == available_size[0] || user_size == available_size[1] || user_size == available_size[2]
				|| user_size == available_size[3]) {
			System.out.println("size is available");
		} else {
			System.out.println("oops,size is not available please try another one");
			int user_size1 = sc.nextInt();
			if (user_size1 == available_size[0] || user_size1 == available_size[1] || user_size1 == available_size[2]
					|| user_size1 == available_size[3]) {
				System.out.println("size is available");
			} else {
				System.out.println("Please visit our place for better options!!");
					}
		}

		System.out.println("Select desired colour-Bliss,Scarlet");
		String usercolour = sc.next();

		String[] colour_available = { "Scarlet","Bliss" };
		if (usercolour.equalsIgnoreCase(colour_available[0]) || usercolour.equalsIgnoreCase(colour_available[1])) {
			System.out.println("nice choice!!");
		} else {
			System.out.println("oops,colours is not available please try another one");
			String usercolour1 = sc.next();
			if (usercolour1.equalsIgnoreCase(colour_available[0]) || usercolour1.equalsIgnoreCase(colour_available[1])) {
				System.out.println("nice choice!!");
			} else {
				System.out.println("Please visit our place for better options!!");
				}
		}
	}

	public static void Superstar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Price-5399/- Rupees only");
		System.out.println("Benefits-Hgh performance running shoes,with extra soft cushion bed.");

		System.out.println("Type size");
		int user_size = sc.nextInt();

		int[] available_size = { 6,7,8, 9, 10, 12 };
		if (user_size == available_size[0] || user_size == available_size[1] || user_size == available_size[2]
				|| user_size == available_size[3] || user_size == available_size[4] || user_size == available_size[5] ) {
			System.out.println("size is available");
		} else {
			System.out.println("oops,size is not available please try another one");
			int user_size1 = sc.nextInt();
			if (user_size1 == available_size[0] || user_size1 == available_size[1] || user_size1 == available_size[2]
					|| user_size1 == available_size[3] || user_size1 == available_size[4] || user_size1 == available_size[5] ) {
				System.out.println("size is available");
			} else {
				System.out.println("Please visit our place for better options!!");
					}
		}

		System.out.println("Select desired colour-Shadow Navy ,Cloud White");
		String usercolour = sc.nextLine();

		String[] colour_available = { "Shadow navy","Cloud white" };
		if (usercolour.equalsIgnoreCase(colour_available[0]) || usercolour.equalsIgnoreCase(colour_available[1])) {
			System.out.println("nice choice!!");
		} else {
			System.out.println("oops,colours is not available please try another one");
			String usercolour1 = sc.nextLine();
			if (usercolour1.equalsIgnoreCase(colour_available[0]) || usercolour1.equalsIgnoreCase(colour_available[1])) {
				System.out.println("nice choice!!");
			} else {
				System.out.println("Please visit our place for better options!!");
			}
		}
	}

	public static void ADIFOM_SLTN_SHOES() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Price-9999/- Rupees only");
		System.out.println(
				"Benefits-They wrap your feet in it, from the pockets of foam in the lining to the foam upper.");

		System.out.println("Type size");
		int user_size = sc.nextInt();

		int[] available_size = { 8, 9, 10, 12 };
		if (user_size == available_size[0] || user_size == available_size[1] || user_size == available_size[2]
				|| user_size == available_size[3]) {
			System.out.println("size is available");
		} else {
			System.out.println("oops,size is not available please try another one");
			int user_size1 = sc.nextInt();
			if (user_size1 == available_size[0] || user_size1 == available_size[1] || user_size1 == available_size[2]
					|| user_size1 == available_size[3]) {
				System.out.println("size is available");
			} else {
				System.out.println("Please visit our place for better options!!");
				}
		}

		System.out.println("Select desire colour-Magic Beige,Beige Tone");
		String usercolour = sc.next();

		String[] colour_available = { "Magic Beige","Beige Tone" };
		if (usercolour.equalsIgnoreCase(colour_available[0]) || usercolour.equalsIgnoreCase(colour_available[1])) {
			System.out.println("nice choice!!");
		} else {
			System.out.println("oops,colours is not available please try another one");
			String usercolour1 = sc.next();
			if (usercolour1.equalsIgnoreCase(colour_available[0]) || usercolour1.equalsIgnoreCase(colour_available[1])) {
				System.out.println("nice choice!!");
			} else {
				System.out.println("Please visit our place for better options!!");
				}
		}
	}

//Loafers for adiddas
	public static void loafers() {
		System.out.println("no loafers for addidas.");
	}

//Addidas formalss
	public static void a_formals() {
		System.out.println("no formals for addidas");
	}

//addidas flipflops
	public static void SLALON_SLIPPERS() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Price-749/- Rupees only");
		System.out.println(
				"Benefits-Features stylish webbing textile and synthetic straps, and textured rubber footbed and outsole");

		System.out.println("Type size");
		int user_size = sc.nextInt();

		int[] available_size = { 7, 8, 9, 10, 12 };
		if (user_size == available_size[0] || user_size == available_size[1] || user_size == available_size[2]
				|| user_size == available_size[3] || user_size == available_size[4]) {
			System.out.println("size is available");
		} else {
			System.out.println("oops,size is not available please try another one");
			int user_size1 = sc.nextInt();
			if (user_size1 == available_size[0] || user_size1 == available_size[1] || user_size1 == available_size[2]
					|| user_size1 == available_size[3] || user_size1 == available_size[4]) {
				System.out.println("size is available");
			} else {
				System.out.println("Please visit our place for better options!!");
			}
		}

		System.out.println("Select desired colour-Stone");
		String usercolour = sc.next();

		String[] colour_available = { "Stone" };
		if (usercolour.equalsIgnoreCase(colour_available[0])) {
			System.out.println("nice choice!!");
		} else {
			System.out.println("oops,colours is not available please try another one");
			String usercolour1 = sc.next();
			if (usercolour1.equalsIgnoreCase(colour_available[0])) {
				System.out.println("nice choice!!");
			} else {
				System.out.println("Please visit our place for better options!!");
			}
		}
	}

	public static void Eezay_Slide_Sandal() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Price-779/- Rupees only");
		System.out.println("Benefits-Features stylish webbing textile");

		System.out.println("Type size");
		int user_size = sc.nextInt();

		int[] available_size = { 7, 8, 9, 10, 12 };
		if (user_size == available_size[0] || user_size == available_size[1] || user_size == available_size[2]
				|| user_size == available_size[3] || user_size == available_size[4]) {
			System.out.println("size is available");
		} else {
			System.out.println("oops,size is not available please try another one");
			int user_size1 = sc.nextInt();
			if (user_size1 == available_size[0] || user_size1 == available_size[1] || user_size1 == available_size[2]
					|| user_size1 == available_size[3] || user_size1 == available_size[4]) {
				System.out.println("size is available");
			} else {
				System.out.println("Please visit our place for better options!!");
				}
		}

		System.out.println("Select desired colour-Trace Green");
		String usercolour = sc.next();

		String[] colour_available = { "Trace green" };
		if (usercolour.equalsIgnoreCase(colour_available[0])) {
			System.out.println("nice choice!!");
		} else {
			System.out.println("oops,colours is not available please try another one");
			String usercolour1 = sc.next();
			if (usercolour1.equalsIgnoreCase(colour_available[0])) {
				System.out.println("nice choice!!");
			} else {
				System.out.println("Please visit our place for better options!!");
				}
		}
	}

	public static void comfort_flip_flops() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Price-779/- Rupees only");
		System.out.println("Benefits-Features stylish webbing textile");

		System.out.println("Type size");
		int user_size = sc.nextInt();

		int[] available_size = { 7, 8, 9, 10, 12 };
		if (user_size == available_size[0] || user_size == available_size[1] || user_size == available_size[2]
				|| user_size == available_size[3] || user_size == available_size[4]) {
			System.out.println("size is available");
		} else {
			System.out.println("oops,size is not available please try another one");
			int user_size1 = sc.nextInt();
			if (user_size1 == available_size[0] || user_size1 == available_size[1] || user_size1 == available_size[2]
					|| user_size1 == available_size[3] || user_size1 == available_size[4]) {
				System.out.println("size is available");
			} else {
				System.out.println("Please visit our place for better options!!");
				}

		}

		System.out.println("Select desired colour-Trace Green");
		String usercolour = sc.next();

		String[] colour_available = { "Trace green" };
		if (usercolour.equalsIgnoreCase(colour_available[0])) {
			System.out.println("nice choice!!");
		} else {
			System.out.println("oops,colours is not available please try another one");
			String usercolour1 = sc.next();
			if (usercolour1.equalsIgnoreCase(colour_available[0])) {
				System.out.println("nice choice!!");
			} else {
				System.out.println("Please visit our place for better options!!");
				}
		}

	}

	public static void RSX_SPLIt() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Price-9,999/- Rupees only");
		System.out.println(
				"Benefits- With a sharp silhouette, striking design and bold colours, itâ€™s a streetwear gamechanger");

		System.out.println("Type size");
		int user_size = sc.nextInt();

		int[] available_size = { 7, 8, 9, 10, 12 };
		if (user_size == available_size[0] || user_size == available_size[1] || user_size == available_size[2]
				|| user_size == available_size[3] || user_size == available_size[4]) {
			System.out.println("size is available");
		} else {
			System.out.println("oops,size is not available please try another one");
			int user_size1 = sc.nextInt();
			if (user_size1 == available_size[0] || user_size1 == available_size[1] || user_size1 == available_size[2]
					|| user_size1 == available_size[3] || user_size1 == available_size[4]) {
				System.out.println("size is available");
			} else {
				System.out.println("Please visit our place for better options!!");
				}
		}

		System.out.println("Select desired colour-white");
		String usercolour = sc.next();

		String[] colour_available = { "white" };
		if (usercolour.equalsIgnoreCase(colour_available[0])) {
			System.out.println("nice choice!!");
		} else {
			System.out.println("oops,colours is not available please try another one");
			String usercolour1 = sc.next();
			if (usercolour1.equalsIgnoreCase(colour_available[0])) {
				System.out.println("nice choice!!");
			} else {
				System.out.println("Please visit our place for better options!!");
					}
		}

	}

	public static void Minecraft_City_Rider_Sneakers() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Price-3,999/- Rupees only");
		System.out.println("Benefits-Inspired by the unmistakable graphics and palettes of the iconic game.");

		System.out.println("Type size");
		int user_size = sc.nextInt();

		int[] available_size = { 10, 12 };
		if (user_size == available_size[0] || user_size == available_size[1]) {
			System.out.println("size is available");
		} else {
			System.out.println("oops,size is not available please try another one");
			int user_size1 = sc.nextInt();
			if (user_size1 == available_size[0] || user_size1 == available_size[1]) {
				System.out.println("size is available");
			} else {
				System.out.println("Please visit our place for better options!!");
				}
		}

		System.out.println("Type colour-colour block");
		String usercolour = sc.next();

		String[] colour_available = { "colour block" };
		if (usercolour.equalsIgnoreCase(colour_available[0])) {
			System.out.println("nice choice!!");
		} else {
			System.out.println("oops,colours is not available please try another one");
			String usercolour1 = sc.next();
			if (usercolour1.equalsIgnoreCase(colour_available[0])) {
				System.out.println("nice choice!!");
			} else {
				System.out.println("Please visit our place for better options!!");
				}
		}
	}

	public static void Porsche_Legacy_RDG_Cat_Motorsport() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Price-7,999/- Rupees only");
		System.out
				.println("Benefits- Transported to some of the most extreme Ridge Roads and passes around the world.");

		System.out.println("Type size");
		int user_size = sc.nextInt();

		int[] available_size = { 7, 8, 10 };
		if (user_size == available_size[0] || user_size == available_size[1] || user_size == available_size[2]) {
			System.out.println("size is available");
		} else {
			System.out.println("oops,size is not available please try another one");
			int user_size1 = sc.nextInt();
			if (user_size1 == available_size[0] || user_size1 == available_size[1] || user_size1 == available_size[2]) {
				System.out.println("size is available");
			} else {
				System.out.println("Please visit our place for better options!!");
					}
		}

		System.out.println("Select desired colour-Black");
		String usercolour = sc.next();

		String[] colour_available = { " black" };
		if (usercolour.equalsIgnoreCase(colour_available[0])) {
			System.out.println("nice choice!!");
		} else {
			System.out.println("oops,colours is not available please try another one");
			String usercolour1 = sc.next();
			if (usercolour1.equalsIgnoreCase(colour_available[0])) {
				System.out.println("nice choice!!");
			} else {
				System.out.println("Please visit our place for better options!!");
					}
		}

	}

//loafers for puma
	public static void Puma_Loafers() {
		System.out.println("no loafers for puma");
	}

//formals for puma

	public static void puma_formals() {
		System.out.println("no formals for puma");
	}

//flipflops for puma
	public static void comfy_v2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Price-839/- Rupees only");
		System.out.println(
				"Benefits-The wardrobe essential and slay every outfit the PUMA Comfy Slippers an all season favorite,perfect for leisure.");

		System.out.println("Type size");
		int user_size = sc.nextInt();

		int[] available_size = { 7, 8, 10, 12 };
		if (user_size == available_size[0] || user_size == available_size[1] || user_size == available_size[2]
				|| user_size == available_size[3]) {
			System.out.println("size is available");
		} else {
			System.out.println("oops,size is not available please try another one");
			int user_size1 = sc.nextInt();
			if (user_size1 == available_size[0] || user_size1 == available_size[1] || user_size1 == available_size[2]
					|| user_size1 == available_size[3]) {
				System.out.println("size is available");
			} else {
				System.out.println("Please visit our place for better options!!");
				}
		}

		System.out.println("Select desire colour-white");
		String usercolour = sc.next();

		String[] colour_available = { "white" };
		if (usercolour.equalsIgnoreCase(colour_available[0])) {
			System.out.println("nice choice!!");
		} else {
			System.out.println("oops,colours is not available please try another one");
			String usercolour1 = sc.next();
			if (usercolour1.equalsIgnoreCase(colour_available[0])) {
				System.out.println("nice choice!!");
			} else {
				System.out.println("Please visit our place for better options!!");
				}
		}

	}

	public static void Felic_Slippers() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Price-1,219/- Rupees only");
		System.out.println(
				"Benefits-This sport-turned-street style, Felic Unisex Slippers,features an all-over synthetic leather upper for a clean look");

		System.out.println("Type size");
		int user_size = sc.nextInt();

		int[] available_size = { 7, 8, 10, 12 };
		if (user_size == available_size[0] || user_size == available_size[1] || user_size == available_size[2]
				|| user_size == available_size[3]) {
			System.out.println("size is available");
		} else {
			System.out.println("oops,size is not available please try another one");
			int user_size1 = sc.nextInt();
			if (user_size1 == available_size[0] || user_size1 == available_size[1] || user_size1 == available_size[2]
					|| user_size1 == available_size[3]) {
				System.out.println("size is available");
			} else {
				System.out.println("Please visit our place for better options!!");
			}
		}

		System.out.println("Select desired colour-white,blue");
		String usercolour = sc.next();

		String[] colour_available = { "blue","white" };
		if (usercolour.equalsIgnoreCase(colour_available[0]) || usercolour.equalsIgnoreCase(colour_available[1])) {
			System.out.println("nice choice!!");
		} else {
			System.out.println("oops,colours is not available please try another one");
			String usercolour1 = sc.next();
			if (usercolour1.equalsIgnoreCase(colour_available[0]) || usercolour1.equalsIgnoreCase(colour_available[1])) {
				System.out.println("nice choice!!");
			} else {
				System.out.println("Please visit our place for better options!!");
				}
		}

	}

	public static void wick_slippers() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Price-1,499/- Rupees only");
		System.out.println(
				"Benefits-The Capster Slippers are designed especially for your indoor strolls,the soft mesh strap and EVA sole makes it light and comfortable to wear all day long.");

		System.out.println("Type size");
		int user_size = sc.nextInt();

		int[] available_size = { 8, 10 ,12 };
		if (user_size == available_size[0] || user_size == available_size[1] || user_size == available_size[2]) {
			System.out.println("size is available");
		} else {
			System.out.println("oops,size is not available please try another one");
			int user_size1 = sc.nextInt();
			if (user_size1 == available_size[0] || user_size1 == available_size[1] || user_size1 == available_size[2]) {
				System.out.println("size is available");
			} else {
				System.out.println("Please visit our place for better options!!");
			}	}

		System.out.println("Type colour-white,orange,blue");
		String usercolour = sc.next();

		String[] colour_available = { "blue","white","orange" };
		if (usercolour.equalsIgnoreCase(colour_available[0]) || usercolour.equalsIgnoreCase(colour_available[1])
				|| usercolour.equalsIgnoreCase(colour_available[2])) {
			System.out.println("nice choice!!");
		} else {
			System.out.println("oops,colours is not available please try another one");
			String usercolour1 = sc.next();
			if (usercolour1.equalsIgnoreCase(colour_available[0]) || usercolour1.equalsIgnoreCase(colour_available[1])
					|| usercolour1.equalsIgnoreCase(colour_available[2])) {
				System.out.println("nice choice!!");
			} else {
				System.out.println("Please visit our place for better options!!");
				}
		}
	}

	public static void Rust_Casual_Shoes() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Price-2,247/- Rupees only");
		System.out.println("Benefits-Set in a classic silhouette with top lace-up closure and TPR sole, ");

		System.out.println("Type size");
		int user_size = sc.nextInt();

		int[] available_size = { 8, 10 ,12 };
		if (user_size == available_size[0] || user_size == available_size[1] || user_size == available_size[2]) {
			System.out.println("size is available");
		} else {
			System.out.println("oops,size is not available please try another one");
			int user_size1 = sc.nextInt();
			if (user_size1 == available_size[0] || user_size1 == available_size[1] || user_size1 == available_size[2]) {
				System.out.println("size is available");
			} else {
				System.out.println("Please visit our place for better options!!");
			}	}

		System.out.println("Select desire colour-brown");
		String usercolour = sc.next();

		String[] colour_available = { "brown" };
		if (usercolour.equalsIgnoreCase(colour_available[0])) {
			System.out.println("nice choice!!");
		} else {
			System.out.println("oops,colours is not available please try another one");
			String usercolour1 = sc.next();
			if (usercolour1.equalsIgnoreCase(colour_available[0])) {
				System.out.println("nice choice!!");
			} else {
				System.out.println("Please visit our place for better options!!");
				}}
	}

	public static void white_sneaker() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Price-2,339/- Rupees only");
		System.out.println(
				"Benefits-These white/green Red Chief casual shoes with contrast-coloured tape on sides and heel collar are a hip and versatile pair to go well with any casual outfit. ");

		System.out.println("Type size");
		int user_size = sc.nextInt();

		int[] available_size = { 8, 10 ,12 };
		if (user_size == available_size[0] || user_size == available_size[1] || user_size == available_size[2]) {
			System.out.println("size is available");
		} else {
			System.out.println("oops,size is not available please try another one");
			int user_size1 = sc.nextInt();
			if (user_size1 == available_size[0] || user_size1 == available_size[1] || user_size1 == available_size[2]) {
				System.out.println("size is available");
			} else {
				System.out.println("Please visit our place for better options!!");
			}	}

		System.out.println("Select desire colour-white");
		String usercolour = sc.next();

		String[] colour_available = { "white" };
		if (usercolour.equalsIgnoreCase(colour_available[0])) {
			System.out.println("nice choice!!");
		} else {
			System.out.println("oops,colours is not available please try another one");
			String usercolour1 = sc.next();
			if (usercolour1.equalsIgnoreCase(colour_available[0])) {
				System.out.println("nice choice!!");
			} else {
				System.out.println("Please visit our place for better options!!");
				}}
	}

	public static void Blue_sneaker() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Price-4,339/- Rupees only");
		System.out.println(
				"Benefits-pair of kicks with sheer casual vibes these blue lace-up shoes feature an overlay design with perforation on the toe and sides.");
		System.out.println("Type size");
		int user_size = sc.nextInt();
		int[] available_size = { 8, 10 ,12 };
		if (user_size == available_size[0] || user_size == available_size[1] || user_size == available_size[2]) {
			System.out.println("size is available");
		} else {
			System.out.println("oops,size is not available please try another one");
			int user_size1 = sc.nextInt();
			if (user_size1 == available_size[0] || user_size1 == available_size[1] || user_size1 == available_size[2]) {
				System.out.println("size is available");
			} else {
				System.out.println("Please visit our place for better options!!");
			}	}

		System.out.println("Select desire colour-blue");
		String usercolour = sc.next();

		String[] colour_available = { "blue" };
		if (usercolour.equalsIgnoreCase(colour_available[0])) {
			System.out.println("nice choice!!");
		} else {
			System.out.println("oops,colours is not available please try another one");
			String usercolour1 = sc.next();
			if (usercolour1.equalsIgnoreCase(colour_available[0])) {
				System.out.println("nice choice!!");
			} else {
				System.out.println("Please visit our place for better options!!");
				}}
	}

// loafers for redcheif
	public static void boat_shoes() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Price-2,347/- Rupees only");
		System.out.println(
				"Benefits-This sport-turned-street style, Felic Unisex Slippers,features an all-over synthetic leather upper for a clean look");

		System.out.println("Type size");
		int user_size = sc.nextInt();

		int[] available_size = { 7, 8, 10, 12 };
		if (user_size == available_size[0] || user_size == available_size[1] || user_size == available_size[2]
				|| user_size == available_size[3]) {
			System.out.println("size is available");
		} else {
			System.out.println("oops,size is not available please try another one");
			int user_size1 = sc.nextInt();
			if (user_size1 == available_size[0] || user_size1 == available_size[1] || user_size1 == available_size[2]
					|| user_size1 == available_size[3]) {
				System.out.println("size is available");
			} else {
				System.out.println("Please visit our place for better options!!");
			}
		}

		System.out.println("Select desired colour-white,blue");
		String usercolour = sc.next();

		String[] colour_available = { "blue","white" };
		if (usercolour.equalsIgnoreCase(colour_available[0]) || usercolour.equalsIgnoreCase(colour_available[1])) {
			System.out.println("nice choice!!");
		} else {
			System.out.println("oops,colours is not available please try another one");
			String usercolour1 = sc.next();
			if (usercolour1.equalsIgnoreCase(colour_available[0]) || usercolour1.equalsIgnoreCase(colour_available[1])) {
				System.out.println("nice choice!!");
			} else {
				System.out.println("Please visit our place for better options!!");
				}
		}
	}

	public static void Leather_formal() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Price-2199/- Rupees only");
		System.out.println(
				"Benefits-This sport-turned-street style, Felic Unisex Slippers,features an all-over synthetic leather upper for a clean look");

		System.out.println("Type size");
		int user_size = sc.nextInt();

		int[] available_size = { 7,8, 10 };
		if (user_size == available_size[0] || user_size == available_size[1] || user_size == available_size[2]) {
			System.out.println("size is available");
		} else {
			System.out.println("oops,size is not available please try another one");
			int user_size1 = sc.nextInt();
			if (user_size1 == available_size[0] || user_size1 == available_size[1] || user_size1 == available_size[2]) {
				System.out.println("size is available");
			} else {
				System.out.println("Please visit our place for better options!!");
			}	}

		System.out.println("Select desire colour-Leather brown");
		String usercolour = sc.next();

		String[] colour_available = { "Leather brown" };
		if (usercolour.equalsIgnoreCase(colour_available[0])) {
			System.out.println("nice choice!!");
		} else {
			System.out.println("oops,colours is not available please try another one");
			String usercolour1 = sc.next();
			if (usercolour1.equalsIgnoreCase(colour_available[0])) {
				System.out.println("nice choice!!");
			} else {
				System.out.println("Please visit our place for better options!!");
				}}

	}

	public static void Boat_shoe_2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Price-2199/- Rupees only");
		System.out.println(
				"Benefits-This sport-turned-street style, Felic Unisex Slippers,features an all-over synthetic leather upper for a clean look");

		System.out.println("Type size");
		int user_size = sc.nextInt();

		int[] available_size = { 7,8, 10 };
		if (user_size == available_size[0] || user_size == available_size[1] || user_size == available_size[2]) {
			System.out.println("size is available");
		} else {
			System.out.println("oops,size is not available please try another one");
			int user_size1 = sc.nextInt();
			if (user_size1 == available_size[0] || user_size1 == available_size[1] || user_size1 == available_size[2]) {
				System.out.println("size is available");
			} else {
				System.out.println("Please visit our place for better options!!");
			}	}

		System.out.println("Select desire colour-Leather brown");
		String usercolour = sc.next();

		String[] colour_available = { "Leather brown" };
		if (usercolour.equalsIgnoreCase(colour_available[0])) {
			System.out.println("nice choice!!");
		} else {
			System.out.println("oops,colours is not available please try another one");
			String usercolour1 = sc.next();
			if (usercolour1.equalsIgnoreCase(colour_available[0])) {
				System.out.println("nice choice!!");
			} else {
				System.out.println("Please visit our place for better options!!");
				}}	}

//formals for red chief
	public static void Formal_Oxford_Shoe() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Price-2795/- Rupees only");
		System.out.println(
				"Benefits-Stylish, flexible and comfort dress shoes perfect for wedding,business,work,formal and casual.");

		System.out.println("Type size");
		int user_size = sc.nextInt();

		int[] available_size = { 7, 8, 10, 12 };
		if (user_size == available_size[0] || user_size == available_size[1] || user_size == available_size[2]
				|| user_size == available_size[3]) {
			System.out.println("size is available");
		} else {
			System.out.println("oops,size is not available please try another one");
			int user_size1 = sc.nextInt();
			if (user_size1 == available_size[0] || user_size1 == available_size[1] || user_size1 == available_size[2]
					|| user_size1 == available_size[3]) {
				System.out.println("size is available");
			} else {
				System.out.println("Please visit our place for better options!!");
			}
		}

		System.out.println("Select desired colour-black,brown");
		String usercolour = sc.next();

		String[] colour_available = { "black","brown" };
		if (usercolour.equalsIgnoreCase(colour_available[0]) || usercolour.equalsIgnoreCase(colour_available[1])) {
			System.out.println("nice choice!!");
		} else {
			System.out.println("oops,colours is not available please try another one");
			String usercolour1 = sc.next();
			if (usercolour1.equalsIgnoreCase(colour_available[0]) || usercolour1.equalsIgnoreCase(colour_available[1])) {
				System.out.println("nice choice!!");
			} else {
				System.out.println("Please visit our place for better options!!");
				}
		}
	}

	public static void RC1090() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Price-3195/- Rupees only");
		System.out.println(
				"Benefits-Shoes are made from very high-quality material, we never compromise with quality, are fully dedicated to providing the highest quality product..");

		System.out.println("Type size");
		int user_size = sc.nextInt();

		int[] available_size = { 7, 8, 10, 12 };
		if (user_size == available_size[0] || user_size == available_size[1] || user_size == available_size[2]
				|| user_size == available_size[3]) {
			System.out.println("size is available");
		} else {
			System.out.println("oops,size is not available please try another one");
			int user_size1 = sc.nextInt();
			if (user_size1 == available_size[0] || user_size1 == available_size[1] || user_size1 == available_size[2]
					|| user_size1 == available_size[3]) {
				System.out.println("size is available");
			} else {
				System.out.println("Please visit our place for better options!!");
			}
		}

		System.out.println("Select desired colour-black,brown");
		String usercolour = sc.next();

		String[] colour_available = { "black","brown" };
		if (usercolour.equalsIgnoreCase(colour_available[0]) || usercolour.equalsIgnoreCase(colour_available[1])) {
			System.out.println("nice choice!!");
		} else {
			System.out.println("oops,colours is not available please try another one");
			String usercolour1 = sc.next();
			if (usercolour1.equalsIgnoreCase(colour_available[0]) || usercolour1.equalsIgnoreCase(colour_available[1])) {
				System.out.println("nice choice!!");
			} else {
				System.out.println("Please visit our place for better options!!");
				}
		}
	}

	public static void Derby_Formal_Shoes9() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Price-2356/- Rupees only");
		System.out.println(
				"Benefits-Designed to be your favorite Shoe for all occasions,Wally Free embodies the lifestyle by combining your passion for comfort, quality, and fashion");

		System.out.println("Type size");
		int user_size = sc.nextInt();

		int[] available_size = {  8, 10, 12 };
		if (user_size == available_size[0] || user_size == available_size[1] || user_size == available_size[2]) {
			System.out.println("size is available");
		} else {
			System.out.println("oops,size is not available please try another one");
			int user_size1 = sc.nextInt();
			if (user_size1 == available_size[0] || user_size1 == available_size[1] || user_size1 == available_size[2]) {
				System.out.println("size is available");
			} else {
				System.out.println("Please visit our place for better options!!");
				}
		}

		System.out.println("Select desire colour-brown");
		String usercolour = sc.next();

		String[] colour_available = { "brown" };
		if (usercolour.equalsIgnoreCase(colour_available[0])) {
			System.out.println("nice choice!!");
		} else {
			System.out.println("oops,colours is not available please try another one");
			String usercolour1 = sc.next();
			if (usercolour1.equalsIgnoreCase(colour_available[0])) {
				System.out.println("nice choice!!");
			} else {
				System.out.println("Please visit our place for better options!!");
				}
		}


	}

//flipflops for red chief
	public static void flipflops_() {
		System.out.println("no flipflops for red cheif");
	}



}

class women {
	public static void womenShoes() {
		System.out.println("please select the desired company");

		System.out.println("select 1. for nike,2.for addidas,3.for puma,4.for red cheif");
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		switch (inp) {
		case 1:
			System.out.println("Select 1.for sneakers,2.for loafers,3.for formals,4. for flipflops ");
			nike();
			break;
		case 2:
			System.out.println("Select 1.for sneakers,2.for loafers,3.for formals,4. for flipflops ");
			adidas();
			break;
		case 3:
			System.out.println("Select 1.for sneakers,2.for loafers,3.for formals,4. for flipflops ");
			puma();
			break;
		case 4:
			System.out.println("Select 1.for sneakers,2.for loafers,3.for formals,4. for flipflops ");
			redCheif();
			break;
		default:
			System.out.println("inappropriate selection");
			System.out.println("please select the desired company");
			System.out.println("select 1. for nike,2.for addidas,3.for puma,4.for red cheif");
			int inp1 = sc.nextInt();
			switch (inp1) {
			case 1:
				System.out.println("Select 1.for sneakers,2.for loafers,3.for formals,4. for flipflops ");
				nike();
				break;
			case 2:
				System.out.println("Select 1.for sneakers,2.for loafers,3.for formals,4. for flipflops ");
				adidas();
				break;
			case 3:
				System.out.println("Select 1.for sneakers,2.for loafers,3.for formals,4. for flipflops ");
				puma();
				break;
			case 4:
				System.out.println("Select 1.for sneakers,2.for loafers,3.for formals,4. for flipflops ");
				redCheif();
				break;
			}
			break;
				}

	}
	public static void nike() {
		Scanner sc=new Scanner(System.in);
		int inp3=sc.nextInt();
		switch(inp3) {
		case 1:
			System.out.println("select 1.for Jordan_Delta_3, 2.for Nike_Air_Max, 3.for Nike_Venture_Runner");
			int inp4=sc.nextInt();
			switch(inp4) {
			case 1: Jordan_Delta_3();
				break;
			case 2: Nike_Air_Max();
			break;
			case 3: Nike_Venture_Runner();
			break;
			default:System.out.println("Selected wrong option please select right option");
			int inp5=sc.nextInt();
			switch(inp5) {
			case 1: Jordan_Delta_3();
			break;
		case 2: Nike_Air_Max();
		break;
		case 3: Nike_Venture_Runner();
		break;
			}
			break;
			}
		break;
		case 2:
			System.out.println("select 1.for loafers_g");
			int inp6=sc.nextInt();
			switch(inp6) {
			case 1: loafers_g();
				break;
			default:System.out.println("Selected wrong option please select right option");
			int inp5=sc.nextInt();
			switch(inp5) {
			case 1: loafers_g();
			break;
			}
			break;
			}
			break;
		case 3:
			System.out.println("Select 1.for formals");
			int inp7=sc.nextInt();
			switch(inp7) {
			case 1: Formals();
				break;
			default:System.out.println("Selected wrong option please select right option");
			int inp5=sc.nextInt();
			switch(inp5) {
			case 1: Formals();
			break;
			}
			break;
			}
			break;
		case 4:
			System.out.println("Select 1.for Nike_Offcourt,2.for Nike_victori_one,3.for Nike_Air_max_90");
			int in8=sc.nextInt();
			switch(in8) {
			case 1: Nike_Offcourt();
				break;
			case 2: Nike_victori_one();
			break;
			case 3: Nike_Air_max_90();
			break;
			default:System.out.println("Selected wrong option please select right option");
			int inp5=sc.nextInt();
			switch(inp5) {
			case 1: Nike_Offcourt();
			break;
		case 2: Nike_victori_one();
		break;
		case 3: Nike_Air_max_90();
		break;
			}
			break;
			}
			break;
			default:System.out.println("inappropriate selection");
			System.out.println("please select the desired option");
			System.out.println("Select 1.for sneakers,2.for loafers,3.for formals,4. for flipflops ");
			int inp1 = sc.nextInt();
			switch (inp1) {
			case 1:
				System.out.println("select 1.for Jordan_Delta_3, 2.for Nike_Air_Max, 3.for Nike_Venture_Runner");
				int in4=sc.nextInt();
				switch(in4) {
				case 1: Jordan_Delta_3();
					break;
				case 2: Nike_Air_Max();
				break;
				case 3: Nike_Venture_Runner();
				break;
				default:System.out.println("Selected wrong option please select right option");
				int inp5=sc.nextInt();
				switch(inp5) {
				case 1: Jordan_Delta_3();
				break;
			case 2: Nike_Air_Max();
			break;
			case 3: Nike_Venture_Runner();
			break;
				}
				break;
				}
			break;
			case 2:
				System.out.println("select 1.for loafers_g");
				int in6=sc.nextInt();
				switch(in6) {
				case 1: loafers_g();
					break;
				default:System.out.println("Selected wrong option please select right option");
				int inp5=sc.nextInt();
				switch(inp5) {
				case 1: loafers_g();
				break;
				}
				break;
				}
				break;
			case 3:
				System.out.println("Select 1.for formals");
				int in7=sc.nextInt();
				switch(in7) {
				case 1: Formals();
					break;
				default:System.out.println("Selected wrong option please select right option");
				int inp5=sc.nextInt();
				switch(inp5) {
				case 1: Formals();
				break;
				}
				break;
				}
				break;
			case 4:
				System.out.println("Select 1.for Nike_Offcourt,2.for Nike_victori_one,3.for Nike_Air_max_90");
				int in9=sc.nextInt();
				switch(in9) {
				case 1: Nike_Offcourt();
					break;
				case 2: Nike_victori_one();
				break;
				case 3: Nike_Air_max_90();
				break;
				default:System.out.println("Selected wrong option please select right option");
				int inp5=sc.nextInt();
				switch(inp5) {
				case 1: Nike_Offcourt();
				break;
			case 2: Nike_victori_one();
			break;
			case 3: Nike_Air_max_90();
			break;
				}
				break;
				}
				break;
			}
		}
		
	}
	
	public static void adidas() {
		Scanner sc=new Scanner(System.in);
		int inp3=sc.nextInt();
		switch(inp3) {
		case 1:
			System.out.println("select 1.for GAZELLE_SHOES, 2.for WOMENS_TRIPLE_S_SNEAKER, 3.for OZELIA_SHOES");
			int inp1=sc.nextInt();
			switch(inp1) {
			case 1: GAZELLE_SHOES();
				break;
			case 2: WOMENS_TRIPLE_S_SNEAKER();
			break;
			case 3: OZELIA_SHOES();
			break;
			default:System.out.println("Selected wrong option please select right option");
			int inp5=sc.nextInt();
			switch(inp5) {
			case 1: GAZELLE_SHOES();
			break;
		case 2: WOMENS_TRIPLE_S_SNEAKER();
		break;
		case 3: OZELIA_SHOES();
		break;
			}
			break;
			}
		break;
		case 2:
			System.out.println("select 1.for loafers");
			int inp4=sc.nextInt();
			switch(inp4) {
			case 1: loafers();
				break;
			default:System.out.println("Selected wrong option please select right option");
			int inp5=sc.nextInt();
			switch(inp5) {
			case 1: loafers();
			break;
			}
			break;
			}
			break;
		case 3:
			System.out.println("Select 1.for formals");
			int inp5=sc.nextInt();
			switch(inp5) {
			case 1: a_formals();
				break;
			default:System.out.println("Selected wrong option please select right option");
			int inp7=sc.nextInt();
			switch(inp7) {
			case 1: a_formals();
			break;
			}
			break;
			}
			break;
		case 4:
			System.out.println("Select 1.for SLALON_SLIPPERS,2.for Eezay_Slide_Sandal,3.for comfort_flip_flops");
			int inp6=sc.nextInt();
			switch(inp6) {
			case 1: SLALON_SLIPPERS();
				break;
			case 2: Eezay_Slide_Sandal();
			break;
			case 3: comfort_flip_flops();
			break;
			default:System.out.println("Selected wrong option please select right option");
			int inp7=sc.nextInt();
			switch(inp7) {
			case 1: SLALON_SLIPPERS();
			break;
		case 2: Eezay_Slide_Sandal();
		break;
		case 3: comfort_flip_flops();
		break;
			}
			break;
			}
			break;
		default:System.out.println("inappropriate selection");
			System.out.println("please select the desired option");
			System.out.println("Select 1.for sneakers,2.for loafers,3.for formals,4. for flipflops ");
			int inp2 = sc.nextInt();
			switch (inp2) {
			case 1:
				System.out.println("select 1.for GAZELLE_SHOES, 2.for WOMENS_TRIPLE_S_SNEAKER, 3.for OZELIA_SHOES");
				int in1=sc.nextInt();
				switch(in1) {
				case 1: GAZELLE_SHOES();
					break;
				case 2: WOMENS_TRIPLE_S_SNEAKER();
				break;
				case 3: OZELIA_SHOES();
				break;
				default:System.out.println("Selected wrong option please select right option");
				int in5=sc.nextInt();
				switch(in5) {
				case 1: GAZELLE_SHOES();
				break;
			case 2: WOMENS_TRIPLE_S_SNEAKER();
			break;
			case 3: OZELIA_SHOES();
			break;
				}
				break;
				}
			break;
			case 2:
				System.out.println("select 1.for loafers");
				int in4=sc.nextInt();
				switch(in4) {
				case 1: loafers();
					break;
				default:System.out.println("Selected wrong option please select right option");
				int in5=sc.nextInt();
				switch(in5) {
				case 1: loafers();
				break;
				}
				break;
				}
				break;
			case 3:
				System.out.println("Select 1.for formals");
				int in5=sc.nextInt();
				switch(in5) {
				case 1: a_formals();
					break;
				default:System.out.println("Selected wrong option please select right option");
				int inp7=sc.nextInt();
				switch(inp7) {
				case 1: a_formals();
				break;
				}
				break;
				}
				break;
			case 4:
				System.out.println("Select 1.for SLALON_SLIPPERS,2.for Eezay_Slide_Sandal,3.for comfort_flip_flops");
				int in6=sc.nextInt();
				switch(in6) {
				case 1: SLALON_SLIPPERS();
					break;
				case 2: Eezay_Slide_Sandal();
				break;
				case 3: comfort_flip_flops();
				break;
				default:System.out.println("Selected wrong option please select right option");
				int inp7=sc.nextInt();
				switch(inp7) {
				case 1: SLALON_SLIPPERS();
				break;
			case 2: Eezay_Slide_Sandal();
			break;
			case 3: comfort_flip_flops();
			break;
				}
				break;
				}
				break;
			}
		}
		
	}
	
	
	public static void puma() {
		Scanner sc=new Scanner(System.in);
		int inp3=sc.nextInt();
		switch(inp3) {
		case 1:
			System.out.println("select 1.for Mayze_Breaking_News, 2.for Cali_Dream_Pastel, 3.for Kosmo_Rider_Pop");
			int ip6=sc.nextInt();
			switch(ip6) {
			case 1: Mayze_Breaking_News();
				break;
			case 2: Cali_Dream_Pastel();
			break;
			case 3: Kosmo_Rider_Pop();
			break;
			default:System.out.println("Selected wrong option please select right option");
			int inp7=sc.nextInt();
			switch(inp7) {
			case 1: Mayze_Breaking_News();
			break;
		case 2: Cali_Dream_Pastel();
		break;
		case 3: Kosmo_Rider_Pop();
		break;
			}
			break;
			}
			break;
		case 2:
			System.out.println("select 1.for Puma_Loafers");
			int ip5=sc.nextInt();
			switch(ip5) {
			case 1: Puma_Loafers();
				break;
			default:System.out.println("Selected wrong option please select right option");
			int inp7=sc.nextInt();
			switch(inp7) {
			case 1: Puma_Loafers();
			break;
			}
			break;
			}
			break;
		case 3:
			System.out.println("Select 1.for Puma_formals");
			int ip4=sc.nextInt();
			switch(ip4) {
			case 1: puma_formals();
				break;
			default:System.out.println("Selected wrong option please select right option");
			int inp7=sc.nextInt();
			switch(inp7) {
			case 1: puma_formals();
			break;
			}
			break;
			}
			break;
		case 4:
			System.out.println("Select 1.for comfy_v2,2.for Felic_Slippers,3.for wick_slippers");
			int ip3=sc.nextInt();
			switch(ip3) {
			case 1: comfy_v2();
				break;
			case 2: Felic_Slippers();
			break;
			case 3: wick_slippers();
			break;
			default:System.out.println("Selected wrong option please select right option");
			int inp7=sc.nextInt();
			switch(inp7) {
			case 1: comfy_v2();
			break;
		case 2: Felic_Slippers();
		break;
		case 3: wick_slippers();
		break;
			}
			break;
			}
			break;
			default:System.out.println("inappropriate selection");
			System.out.println("please select the desired option");
			System.out.println("Select 1.for sneakers,2.for loafers,3.for formals,4. for flipflops ");
			int inp1 = sc.nextInt();
			switch (inp1) {
			case 1:
				System.out.println("select 1.for Mayze_Breaking_News, 2.for Cali_Dream_Pastel, 3.for Kosmo_Rider_Pop");
				int in6=sc.nextInt();
				switch(in6) {
				case 1: Mayze_Breaking_News();
					break;
				case 2: Cali_Dream_Pastel();
				break;
				case 3: Kosmo_Rider_Pop();
				break;
				default:System.out.println("Selected wrong option please select right option");
				int inp7=sc.nextInt();
				switch(inp7) {
				case 1: Mayze_Breaking_News();
				break;
			case 2: Cali_Dream_Pastel();
			break;
			case 3: Kosmo_Rider_Pop();
			break;
				}
				break;
				}
				break;
			case 2:
				System.out.println("select 1.for Puma_Loafers");
				int in5=sc.nextInt();
				switch(in5) {
				case 1: Puma_Loafers();
					break;
				default:System.out.println("Selected wrong option please select right option");
				int inp7=sc.nextInt();
				switch(inp7) {
				case 1: Puma_Loafers();
				break;
				}
				break;
				}
				break;
			case 3:
				System.out.println("Select 1.for Puma_formals");
				int in4=sc.nextInt();
				switch(in4) {
				case 1: puma_formals();
					break;
				default:System.out.println("Selected wrong option please select right option");
				int inp7=sc.nextInt();
				switch(inp7) {
				case 1: puma_formals();
				break;
				}
				break;
				}
				break;
			case 4:
				System.out.println("Select 1.for comfy_v2,2.for Felic_Slippers,3.for wick_slippers");
				int in3=sc.nextInt();
				switch(in3) {
				case 1: comfy_v2();
					break;
				case 2: Felic_Slippers();
				break;
				case 3: wick_slippers();
				break;
				default:System.out.println("Selected wrong option please select right option");
				int inp7=sc.nextInt();
				switch(inp7) {
				case 1: comfy_v2();
				break;
			case 2: Felic_Slippers();
			break;
			case 3: wick_slippers();
			break;
				}
				break;
				}
				break;
			}
		}
		
	}
	
	public static void redCheif() {
		Scanner sc=new Scanner(System.in);
		int inp3=sc.nextInt();
		switch(inp3) {
		case 1:
			System.out.println("select 1.for furoL9001, 2.for furoL9010_816");
			int in3=sc.nextInt();
			switch(in3) {
			case 1: furoL9001();
				break;
			case 2: furoL9010_816();
			break;
			default:System.out.println("Selected wrong option please select right option");
			int inp7=sc.nextInt();
			switch(inp7) {
			case 1: furoL9001();
			break;
		case 2: furoL9010_816();
		break;
			}
			break;
			}
			break;
		case 2:
			System.out.println("select 1.for loafers_g");
			int in2=sc.nextInt();
			switch(in2) {
			case 1: loafers_g();
				break;
			default:System.out.println("Selected wrong option please select right option");
			int inp7=sc.nextInt();
			switch(inp7) {
			case 1: loafers_g();
			break;
			}
			break;
			}
			break;
		case 3:
			System.out.println("Select 1.for Formal");
			int in1=sc.nextInt();
			switch(in1) {
			case 1: formals_g();
				break;
			default:System.out.println("Selected wrong option please select right option");
			int inp7=sc.nextInt();
			switch(inp7) {
			case 1: formals_g();
			break;
			}
			break;
			}
			break;
		case 4:
			System.out.println("Select 1.for Furo_flips, 2.for furo_slide");
			int in4=sc.nextInt();
			switch(in4) {
			case 1: Furo_flips();
				break;
			case 2: furo_slide();
			break;
			default:System.out.println("Selected wrong option please select right option");
			int inp7=sc.nextInt();
			switch(inp7) {
			case 1: Furo_flips();
			break;
		case 2: furo_slide();
		break;
			}
			break;
			}
			break;
			default:System.out.println("inappropriate selection");
			System.out.println("please select the desired option");
			System.out.println("Select 1.for sneakers,2.for loafers,3.for formals,4. for flipflops ");
			int inp1 = sc.nextInt();
			switch (inp1) {
			case 1:
				System.out.println("select 1.for furoL9001, 2.for furoL9010_816");
				int ip3=sc.nextInt();
				switch(ip3) {
				case 1: furoL9001();
					break;
				case 2: furoL9010_816();
				break;
				default:System.out.println("Selected wrong option please select right option");
				int inp7=sc.nextInt();
				switch(inp7) {
				case 1: furoL9001();
				break;
			case 2: furoL9010_816();
			break;
				}
				break;
				}
				break;
			case 2:
				System.out.println("select 1.for loafers_g");
				int ip2=sc.nextInt();
				switch(ip2) {
				case 1: loafers_g();
					break;
				default:System.out.println("Selected wrong option please select right option");
				int inp7=sc.nextInt();
				switch(inp7) {
				case 1: loafers_g();
				break;
				}
				break;
				}
				break;
			case 3:
				System.out.println("Select 1.for Formal");
				int ip1=sc.nextInt();
				switch(ip1) {
				case 1: formals_g();
					break;
				default:System.out.println("Selected wrong option please select right option");
				int inp7=sc.nextInt();
				switch(inp7) {
				case 1: formals_g();
				break;
				}
				break;
				}
				break;
			case 4:
				System.out.println("Select 1.for Furo_flips, 2.for furo_slide");
				int ip4=sc.nextInt();
				switch(ip4) {
				case 1: Furo_flips();
					break;
				case 2: furo_slide();
				break;
				default:System.out.println("Selected wrong option please select right option");
				int inp7=sc.nextInt();
				switch(inp7) {
				case 1: Furo_flips();
				break;
			case 2: furo_slide();
			break;
				}
				break;
				}
				break;
			}
		}
		
	}
	
	public static void Jordan_Delta_3() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Jordan_Delta_3");
		System.out.println("Price-12,157/- Rupees only");
		System.out.println("Airy Ripstop and soft suede are paired with a seamless interior.");

		System.out.println("Type size");
		int user_size = sc.nextInt();

		int[] size_available = { 8, 9, 10, 12 };

		if (user_size == size_available[0] || user_size == size_available[1] || user_size == size_available[2]
				|| user_size == size_available[3]) {
			System.out.println("size is available");

		} else {
			System.out.println("oops,size is not available please try another one");
		}

		System.out.println("Type colours-Brown,Red,White,Pink");
		String user_colour = sc.next();

		String[] colour_available = {"White", "Pink", "Brown"};

		if (user_colour.equalsIgnoreCase(colour_available[0]) || user_colour.equalsIgnoreCase(colour_available[1])
				|| user_colour.equalsIgnoreCase(colour_available[3])) {
			System.out.println("wow!!Nice choice");
		} else {
			System.out.println("oops,colours is not available please try another one");
		}
	}

	public static void Nike_Air_Max()

	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Price-16,995/- Rupees only");
		System.out.println(
				"For a high-end finish, its distinct (and super-soft) outsole adds an air of sophistication that'll keep heads turning");

		System.out.println("Type size");
		int user_size = sc.nextInt();

		int[] size_available = { 9, 10, 12 };

		if (user_size == size_available[0] || user_size == size_available[1] || user_size == size_available[2]) {
			System.out.println("size is available");
		} else {
			System.out.println("oops,size is not available please try another one");
		}

		System.out.println("Type colour-Grey,Brown");
		String usercolour = sc.next();

		String[] colour_available = { "Brown" };
		if (usercolour.equalsIgnoreCase(colour_available[0])) {
			System.out.println("nice choice!!");
		} else {
			System.out.println("oops,colours is not available please try another one");
		}

	}

	public static void Nike_Venture_Runner() {
		Scanner sc = new Scanner(System.in);

		System.out.println("price-5599/- rupees only");
		System.out.println(
				"The Nike Venture Runner nods to the iconic shoes of the '80s that started the running revolution.");

		System.out.println("Type size");
		int user_size = sc.nextInt();

		int[] available_size = { 8, 9, 10 };
		if (user_size == available_size[0] || user_size == available_size[1] || user_size == available_size[2]) {
			System.out.println("size is available");
		} else {
			System.out.println("oops,size is not available please try another one");
		}

		System.out.println("Type colour-Offwhite,White");
		String usercolour = sc.next();

		String[] colour_available = { "White", "Offwhite" };
		if (usercolour.equalsIgnoreCase(colour_available[0]) || usercolour.equalsIgnoreCase(colour_available[1])) {
			System.out.println("nice choice!!");
		} else {
			System.out.println("oops,colours is not available please try another one");
		}

	}

//loafers of nike
	public static void loafers_g() {
		System.out.println("No lofaers!!!");
	}

//formals of nike
	public static void Formals() {
		System.out.println("sorry no formal shoes for nike");
	}

//flipflops for nike
	public static void Nike_Offcourt() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Price-2495/- Rupees only");
		System.out.println(
				"Benefits-Innovative dual-layered foam underfoot pairs with a plush strap to bring the comfort,");

		System.out.println("Type size");
		int user_size = sc.nextInt();

		int[] available_size = { 6, 7, 8, 9, 10, 12 };
		if (user_size == available_size[0] || user_size == available_size[1] || user_size == available_size[2]
				|| user_size == available_size[3] || user_size == available_size[4] || user_size == available_size[5]) {
			System.out.println("size is available");
		} else {
			System.out.println("oops,size is not available please try another one");
		}

		System.out.println("Type colour-White,Orange,Black,Offwhite");
		String usercolour = sc.next();

		String[] colour_available = { "White,Orange,Black,Offwhite" };
		if (usercolour.equalsIgnoreCase(colour_available[0]) || usercolour.equalsIgnoreCase(colour_available[1])
				|| usercolour.equalsIgnoreCase(colour_available[2])
				|| usercolour.equalsIgnoreCase(colour_available[3])) {
			System.out.println("nice choice!!");
		} else {
			System.out.println("oops,colours is not available please try another one");
		}
	}

	public static void Nike_victori_one() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Price-2595/- Rupees only");
		System.out.println(
				"Benefits-features new, softer foam that feels comfortable while the contoured footbed with grip. ");

		System.out.println("Type size");
		int user_size = sc.nextInt();

		int[] available_size = { 7, 8, 9, 10, 12 };
		if (user_size == available_size[0] || user_size == available_size[1] || user_size == available_size[2]
				|| user_size == available_size[3] || user_size == available_size[4]) {
			System.out.println("size is available");
		} else {
			System.out.println("oops,size is not available please try another one");
		}

		System.out.println("Type colour-White,Red,Black,Offwhite");
		String usercolour = sc.next();

		String[] colour_available = { "White,Orange,Black,red" };
		if (usercolour.equalsIgnoreCase(colour_available[0]) || usercolour.equalsIgnoreCase(colour_available[1])
				|| usercolour.equalsIgnoreCase(colour_available[2])
				|| usercolour.equalsIgnoreCase(colour_available[3])) {
			System.out.println("nice choice!!");
		} else {
			System.out.println("oops,colours is not available please try another one");
		}
	}

	public static void Nike_Air_max_90() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Price-5995/- Rupees only");
		System.out.println("Benefits-The foam footbed and plush strap lining offer comfort and support.");

		System.out.println("Type size");
		int user_size = sc.nextInt();

		int[] available_size = { 5, 6, 7, 8, 9, 10, 12 };
		if (user_size == available_size[0] || user_size == available_size[1] || user_size == available_size[2]
				|| user_size == available_size[3] || user_size == available_size[4] || user_size == available_size[6]
				|| user_size == available_size[5]) {
			System.out.println("size is available");
		} else {
			System.out.println("oops,size is not available please try another one");
		}

		System.out.println("Type colour-White,Black");
		String usercolour = sc.next();

		String[] colour_available = { "White,Black" };
		if (usercolour.equalsIgnoreCase(colour_available[0]) || usercolour.equalsIgnoreCase(colour_available[1])) {
			System.out.println("nice choice!!");
		} else {
			System.out.println("oops,colours is not available please try another one");
		}
	}

	public static void GAZELLE_SHOES() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Price-10995/- Rupees only");
		System.out.println(
				"Benefits-From football fans in the '60s and '70s to skaters and indie rockers in the '90s,The adidas Gazelle Shoes have traversed the entirety of our cultural landscape. .");

		System.out.println("Type size");
		int user_size = sc.nextInt();

		int[] available_size = { 8, 9, 10, 12 };
		if (user_size == available_size[0] || user_size == available_size[1] || user_size == available_size[2]
				|| user_size == available_size[3]) {
			System.out.println("size is available");
		} else {
			System.out.println("oops,size is not available please try another one");
		}

		System.out.println("Type colour-Schock purple,Cloud white,Metallic gold");
		String usercolour = sc.next();

		String[] colour_available = { "Schock purple,Metallic gold" };
		if (usercolour.equalsIgnoreCase(colour_available[0]) || usercolour.equalsIgnoreCase(colour_available[1])) {
			System.out.println("nice choice!!");
		} else {
			System.out.println("oops,colours is not available please try another one");
		}
	}

	public static void WOMENS_TRIPLE_S_SNEAKER() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Price-1,03,000/- Rupees only");
		System.out.println(
				"Benefits- The shoes feature a leather-free foam and mesh upper set on a triple-layer outsole..");

		System.out.println("Type size");
		String user_size = sc.nextLine();

		String available_size = "06,07,08,09,10,12";
		if (user_size == available_size) {
			System.out.println("size is available");
		} else {
			System.out.println("oops,size is not available please try another one");
		}

		System.out.println("Type colour-Shadow Navy ,Cream White ,Cloud White");
		String usercolour = sc.nextLine();

		String[] colour_available = { "Blue,white" };
		if (usercolour.equalsIgnoreCase(colour_available[1])) {
			System.out.println("nice choice!!");
		} else {
			System.out.println("oops,colours is not available please try another one");
		}
	}

	public static void OZELIA_SHOES() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Price-10,999/- Rupees only");
		System.out.println(
				"Benefits-Love the '90s, but live right now? You can revisit the decade every time you lace into these adidas shoes");

		System.out.println("Type size");
		int user_size = sc.nextInt();

		int[] size_available = { 8, 9, 10, 12 };

		if (user_size == size_available[0] || user_size == size_available[1] || user_size == size_available[2]
				|| user_size == size_available[3]) {
			System.out.println("size is available");

		} else {
			System.out.println("oops,size is not available please try another one");
			int user_size1 = sc.nextInt();
			if (user_size1 == size_available[0] || user_size1 == size_available[1] || user_size1 == size_available[2]
					|| user_size1 == size_available[3]) {
				System.out.println("size is available");

			} else {
				System.out.println("Please visit our place for better options!!");
							}
		}

		System.out.println("Select desired colour - Black,White");
		String user_colour = sc.next();

		String[] colour_available = { "White", "Brown", "Pink" };

		if (user_colour.equalsIgnoreCase(colour_available[0]) || user_colour.equalsIgnoreCase(colour_available[1]) || user_colour.equalsIgnoreCase(colour_available[2])) {
			System.out.println("wow!!Nice choice");
		} else {
			System.out.println("oops,colours is not available please try another one");
			String user_colour1 = sc.next();
			if (user_colour1.equalsIgnoreCase(colour_available[0]) || user_colour1.equalsIgnoreCase(colour_available[1]) || user_colour.equalsIgnoreCase(colour_available[2])) {
				System.out.println("wow!!Nice choice");
			} else {
				System.out.println("Please visit our place for better options!!");
					}
		}

	}

//Loafers for adiddas
	public static void loafers() {
		System.out.println("no loafers for addidas.");
	}

//Addidas formalss
	public static void a_formals() {
		System.out.println("no formals for addidas");
	}

//addidas flipflops
	public static void SLALON_SLIPPERS() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Price-749/- Rupees only");
		System.out.println(
				"Benefits-Features stylish webbing textile and synthetic straps, and textured rubber footbed and outsole");

		System.out.println("Type size");
		int user_size = sc.nextInt();

		int[] available_size = { 7, 8, 9, 10, 12 };
		if (user_size == available_size[0] || user_size == available_size[1] || user_size == available_size[2]
				|| user_size == available_size[3] || user_size == available_size[4]) {
			System.out.println("size is available");
		} else {
			System.out.println("oops,size is not available please try another one");
			int user_size1 = sc.nextInt();
			if (user_size1 == available_size[0] || user_size1 == available_size[1] || user_size1 == available_size[2]
					|| user_size1 == available_size[3] || user_size1 == available_size[4]) {
				System.out.println("size is available");
			} else {
				System.out.println("Please visit our place for better options!!");
			}
		}

		System.out.println("Select desired colour-Stone");
		String usercolour = sc.next();

		String[] colour_available = { "Stone" };
		if (usercolour.equalsIgnoreCase(colour_available[0])) {
			System.out.println("nice choice!!");
		} else {
			System.out.println("oops,colours is not available please try another one");
			String usercolour1 = sc.next();
			if (usercolour1.equalsIgnoreCase(colour_available[0])) {
				System.out.println("nice choice!!");
			} else {
				System.out.println("Please visit our place for better options!!");
			}
		}

	}

	public static void Eezay_Slide_Sandal() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Price-779/- Rupees only");
		System.out.println("Benefits-Features stylish webbing textile");

		System.out.println("Type size");
		int user_size = sc.nextInt();

		int[] available_size = { 7, 8, 9, 10, 12 };
		if (user_size == available_size[0] || user_size == available_size[1] || user_size == available_size[2]
				|| user_size == available_size[3] || user_size == available_size[4]) {
			System.out.println("size is available");
		} else {
			System.out.println("oops,size is not available please try another one");
			int user_size1 = sc.nextInt();
			if (user_size1 == available_size[0] || user_size1 == available_size[1] || user_size1 == available_size[2]
					|| user_size1 == available_size[3] || user_size1 == available_size[4]) {
				System.out.println("size is available");
			} else {
				System.out.println("Please visit our place for better options!!");
				}
		}

		System.out.println("Select desired colour-Trace Green");
		String usercolour = sc.next();

		String[] colour_available = { "Trace green" };
		if (usercolour.equalsIgnoreCase(colour_available[0])) {
			System.out.println("nice choice!!");
		} else {
			System.out.println("oops,colours is not available please try another one");
			String usercolour1 = sc.next();
			if (usercolour1.equalsIgnoreCase(colour_available[0])) {
				System.out.println("nice choice!!");
			} else {
				System.out.println("Please visit our place for better options!!");
				}
		}

	}

	public static void comfort_flip_flops() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Price-779/- Rupees only");
		System.out.println("Benefits-Features stylish webbing textile");

		System.out.println("Type size");
		int user_size = sc.nextInt();

		int[] available_size = { 7, 8, 9, 10, 12 };
		if (user_size == available_size[0] || user_size == available_size[1] || user_size == available_size[2]
				|| user_size == available_size[3] || user_size == available_size[4]) {
			System.out.println("size is available");
		} else {
			System.out.println("oops,size is not available please try another one");
			int user_size1 = sc.nextInt();
			if (user_size1 == available_size[0] || user_size1 == available_size[1] || user_size1 == available_size[2]
					|| user_size1 == available_size[3] || user_size1 == available_size[4]) {
				System.out.println("size is available");
			} else {
				System.out.println("Please visit our place for better options!!");
				}
		}

		System.out.println("Select desired colour-Trace Green");
		String usercolour = sc.next();

		String[] colour_available = { "Trace green" };
		if (usercolour.equalsIgnoreCase(colour_available[0])) {
			System.out.println("nice choice!!");
		} else {
			System.out.println("oops,colours is not available please try another one");
			String usercolour1 = sc.next();
			if (usercolour1.equalsIgnoreCase(colour_available[0])) {
				System.out.println("nice choice!!");
			} else {
				System.out.println("Please visit our place for better options!!");
				}
		}


	}

	public static void Mayze_Breaking_News() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Price-8,999/- Rupees only");
		System.out.println("Benefits- For the hype girls, the street enthusiasts, the trend setters the Mayze. ");

		System.out.println("Type size");
		int user_size = sc.nextInt();

		int[] available_size = { 7, 8, 9, 10 };
		if (user_size == available_size[0] || user_size == available_size[1] || user_size == available_size[2]
				|| user_size == available_size[3]) {
			System.out.println("size is available");
		} else {
			System.out.println("oops,size is not available please try another one");
			int user_size1 = sc.nextInt();
			if (user_size1 == available_size[0] || user_size1 == available_size[1] || user_size1 == available_size[2]
					|| user_size1 == available_size[3]) {
				System.out.println("size is available");
			} else {
				System.out.println("Please visit our place for better options!!");
				}
		}

		System.out.println("Select desired colour-Pink");
		String usercolour = sc.next();

		String[] colour_available = { "Pink" };
		if (usercolour.equalsIgnoreCase(colour_available[0])) {
			System.out.println("nice choice!!");
		} else {
			System.out.println("oops,colours is not available please try another one");
			String usercolour1 = sc.next();
			if (usercolour1.equalsIgnoreCase(colour_available[0])) {
				System.out.println("nice choice!!");
			} else {
				System.out.println("Please visit our place for better options!!");
				}
		}

	}

	public static void Cali_Dream_Pastel() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Price-7,999/- Rupees only");
		System.out.println(
				"Benefits-Laid-back beach fashion gets a modern boost of design and innovation that's perfect for fresh, whimsical style in this.");

		System.out.println("Type size");
		int user_size = sc.nextInt();

		int[] available_size = { 10, 12 };
		if (user_size == available_size[0] || user_size == available_size[1]) {
			System.out.println("size is available");
		} else {
			System.out.println("oops,size is not available please try another one");
			int user_size1 = sc.nextInt();
			if (user_size1 == available_size[0] || user_size1 == available_size[1]) {
				System.out.println("size is available");
			} else {
				System.out.println("Please visit our place for better options!!");
				}
		}

		System.out.println("Type colour-blue-wash marshmellow");
		String usercolour = sc.next();

		String[] colour_available = { "blue-wash marshmellow" };
		if (usercolour.equalsIgnoreCase(colour_available[0])) {
			System.out.println("nice choice!!");
		} else {
			System.out.println("oops,colours is not available please try another one");
			String usercolour1 = sc.next();
			if (usercolour1.equalsIgnoreCase(colour_available[0])) {
				System.out.println("nice choice!!");
			} else {
				System.out.println("Please visit our place for better options!!");
				}
		}
	}

	public static void Kosmo_Rider_Pop() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Price-7,999/- Rupees only");
		System.out
				.println("Benefits- Transported to some of the most extreme Ridge Roads and passes around the world.");

		System.out.println("Type size");
		int user_size = sc.nextInt();

		int[] available_size = { 7, 8, 10, 12 };
		if (user_size == available_size[0] || user_size == available_size[1] || user_size == available_size[2]
				|| user_size == available_size[3]) {
			System.out.println("size is available");
		} else {
			System.out.println("oops,size is not available please try another one");
			int user_size1 = sc.nextInt();
			if (user_size1 == available_size[0] || user_size1 == available_size[1] || user_size1 == available_size[2]
					|| user_size1 == available_size[3]) {
				System.out.println("size is available");
			} else {
				System.out.println("Please visit our place for better options!!");
				}
		}

		System.out.println("Select desire colour-white");
		String usercolour = sc.next();

		String[] colour_available = { "white" };
		if (usercolour.equalsIgnoreCase(colour_available[0])) {
			System.out.println("nice choice!!");
		} else {
			System.out.println("oops,colours is not available please try another one");
			String usercolour1 = sc.next();
			if (usercolour1.equalsIgnoreCase(colour_available[0])) {
				System.out.println("nice choice!!");
			} else {
				System.out.println("Please visit our place for better options!!");
				}
		}



	}

//loafers for puma
	public static void Puma_Loafers() {
		System.out.println("no loafers for puma");
	}

//formals for puma

	public static void puma_formals() {
		System.out.println("no formals for puma");
	}

//flipflops for puma
	public static void comfy_v2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Price-839/- Rupees only");
		System.out.println(
				"Benefits-The wardrobe essential and slay every outfit the PUMA Comfy Slippers an all season favorite,perfect for leisure.");

		System.out.println("Type size");
		int user_size = sc.nextInt();

		int[] available_size = { 7, 8, 10, 12 };
		if (user_size == available_size[0] || user_size == available_size[1] || user_size == available_size[2]
				|| user_size == available_size[3]) {
			System.out.println("size is available");
		} else {
			System.out.println("oops,size is not available please try another one");
			int user_size1 = sc.nextInt();
			if (user_size1 == available_size[0] || user_size1 == available_size[1] || user_size1 == available_size[2]
					|| user_size1 == available_size[3]) {
				System.out.println("size is available");
			} else {
				System.out.println("Please visit our place for better options!!");
				}
		}

		System.out.println("Select desire colour-white");
		String usercolour = sc.next();

		String[] colour_available = { "white" };
		if (usercolour.equalsIgnoreCase(colour_available[0])) {
			System.out.println("nice choice!!");
		} else {
			System.out.println("oops,colours is not available please try another one");
			String usercolour1 = sc.next();
			if (usercolour1.equalsIgnoreCase(colour_available[0])) {
				System.out.println("nice choice!!");
			} else {
				System.out.println("Please visit our place for better options!!");
				}
		}


	}

	public static void Felic_Slippers() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Price-1,219/- Rupees only");
		System.out.println(
				"Benefits-This sport-turned-street style, Felic Unisex Slippers,features an all-over synthetic leather upper for a clean look");

		System.out.println("Type size");
		int user_size = sc.nextInt();

		int[] available_size = { 7, 8, 10, 12 };
		if (user_size == available_size[0] || user_size == available_size[1] || user_size == available_size[2]
				|| user_size == available_size[3]) {
			System.out.println("size is available");
		} else {
			System.out.println("oops,size is not available please try another one");
			int user_size1 = sc.nextInt();
			if (user_size1 == available_size[0] || user_size1 == available_size[1] || user_size1 == available_size[2]
					|| user_size1 == available_size[3]) {
				System.out.println("size is available");
			} else {
				System.out.println("Please visit our place for better options!!");
				}
		}

		System.out.println("Select desire colour-blue,white");
		String usercolour = sc.next();

		String[] colour_available = { "white","blue" };
		if (usercolour.equalsIgnoreCase(colour_available[0]) || usercolour.equalsIgnoreCase(colour_available[1])) {
			System.out.println("nice choice!!");
		} else {
			System.out.println("oops,colours is not available please try another one");
			String usercolour1 = sc.next();
			if (usercolour1.equalsIgnoreCase(colour_available[0]) || usercolour1.equalsIgnoreCase(colour_available[1])) {
				System.out.println("nice choice!!");
			} else {
				System.out.println("Please visit our place for better options!!");
				}
		}



	}

	public static void wick_slippers() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Price-1,499/- Rupees only");
		System.out.println(
				"Benefits-The Capster Slippers are designed especially for your indoor strolls,the soft mesh strap and EVA sole makes it light and comfortable to wear all day long.");

		System.out.println("Type size");
		int user_size = sc.nextInt();

		int[] available_size = { 8, 10 ,12 };
		if (user_size == available_size[0] || user_size == available_size[1] || user_size == available_size[2]) {
			System.out.println("size is available");
		} else {
			System.out.println("oops,size is not available please try another one");
			int user_size1 = sc.nextInt();
			if (user_size1 == available_size[0] || user_size1 == available_size[1] || user_size1 == available_size[2]) {
				System.out.println("size is available");
			} else {
				System.out.println("Please visit our place for better options!!");
			}	}

		System.out.println("Type colour-white,orange,blue");
		String usercolour = sc.next();

		String[] colour_available = { "blue","white","orange" };
		if (usercolour.equalsIgnoreCase(colour_available[0]) || usercolour.equalsIgnoreCase(colour_available[1])
				|| usercolour.equalsIgnoreCase(colour_available[2])) {
			System.out.println("nice choice!!");
		} else {
			System.out.println("oops,colours is not available please try another one");
			String usercolour1 = sc.next();
			if (usercolour1.equalsIgnoreCase(colour_available[0]) || usercolour1.equalsIgnoreCase(colour_available[1])
					|| usercolour1.equalsIgnoreCase(colour_available[2])) {
				System.out.println("nice choice!!");
			} else {
				System.out.println("Please visit our place for better options!!");
				}
		}
	}
	
	public static void furoL9001() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Price-999/- Rupees only");
		System.out.println("Benefits-Sports wear");

		System.out.println("Type size");
		int user_size = sc.nextInt();

		int[] available_size = { 8, 10 ,12 };
		if (user_size == available_size[0] || user_size == available_size[1] || user_size == available_size[2]) {
			System.out.println("size is available");
		} else {
			System.out.println("oops,size is not available please try another one");
			int user_size1 = sc.nextInt();
			if (user_size1 == available_size[0] || user_size1 == available_size[1] || user_size1 == available_size[2]) {
				System.out.println("size is available");
			} else {
				System.out.println("Please visit our place for better options!!");
			}	}

		System.out.println("Type colour-white,purple");
		String usercolour = sc.next();

		String[] colour_available = { "white","purple" };
		if (usercolour.equalsIgnoreCase(colour_available[0]) || usercolour.equalsIgnoreCase(colour_available[1])) {
			System.out.println("nice choice!!");
		} else {
			System.out.println("oops,colours is not available please try another one");
			String usercolour1 = sc.next();
			if (usercolour1.equalsIgnoreCase(colour_available[0]) || usercolour1.equalsIgnoreCase(colour_available[1])) {
				System.out.println("nice choice!!");
			} else {
				System.out.println("Please visit our place for better options!!");
				}
		}
	}

	public static void furoL9010_816() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Price-1316/- Rupees only");
		System.out.println("Benefits-Sports wear");

		System.out.println("Type size");
		int user_size = sc.nextInt();

		int[] available_size = { 8, 10 ,12 };
		if (user_size == available_size[0] || user_size == available_size[1] || user_size == available_size[2]) {
			System.out.println("size is available");
		} else {
			System.out.println("oops,size is not available please try another one");
			int user_size1 = sc.nextInt();
			if (user_size1 == available_size[0] || user_size1 == available_size[1] || user_size1 == available_size[2]) {
				System.out.println("size is available");
			} else {
				System.out.println("Please visit our place for better options!!");
			}	}

		System.out.println("Type colour-pink,grey");
		String usercolour = sc.next();

		String[] colour_available = { "pink","grey" };
		if (usercolour.equalsIgnoreCase(colour_available[0]) || usercolour.equalsIgnoreCase(colour_available[1])) {
			System.out.println("nice choice!!");
		} else {
			System.out.println("oops,colours is not available please try another one");
			String usercolour1 = sc.next();
			if (usercolour1.equalsIgnoreCase(colour_available[0]) || usercolour1.equalsIgnoreCase(colour_available[1])) {
				System.out.println("nice choice!!");
			} else {
				System.out.println("Please visit our place for better options!!");
				}
		}
	}

// formals for women
	public static void formals_g() {
		System.out.println("no formals for women");
	}

//flipflops for women
	public static void furo_slide() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Price-489/- Rupees only");
		System.out.println("Benefits-Synthetic rubber provides soft and cushined bed for foot");

		System.out.println("Type size");
		int user_size = sc.nextInt();

		int[] available_size = { 7, 8, 9, 10 };
		if (user_size == available_size[0] || user_size == available_size[1] || user_size == available_size[2]
				|| user_size == available_size[3]) {
			System.out.println("size is available");
		} else {
			System.out.println("oops,size is not available please try another one");
			int user_size1 = sc.nextInt();
			if (user_size1 == available_size[0] || user_size1 == available_size[1] || user_size1 == available_size[2]
					|| user_size1 == available_size[3]) {
				System.out.println("size is available");
			} else {
				System.out.println("Please visit our place for better options!!");
				}
		}

		System.out.println("Select desired colour-Pink");
		String usercolour = sc.next();

		String[] colour_available = { "Pink" };
		if (usercolour.equalsIgnoreCase(colour_available[0])) {
			System.out.println("nice choice!!");
		} else {
			System.out.println("oops,colours is not available please try another one");
			String usercolour1 = sc.next();
			if (usercolour1.equalsIgnoreCase(colour_available[0])) {
				System.out.println("nice choice!!");
			} else {
				System.out.println("Please visit our place for better options!!");
				}
		}


	}

	public static void Furo_flips() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Price-699/- Rupees only");
		System.out.println("Benefits-Strong soal,Provides solid grip on slippy surfaces");

		System.out.println("Type size");
		int user_size = sc.nextInt();

		int[] available_size = { 8, 10 ,12 };
		if (user_size == available_size[0] || user_size == available_size[1] || user_size == available_size[2]) {
			System.out.println("size is available");
		} else {
			System.out.println("oops,size is not available please try another one");
			int user_size1 = sc.nextInt();
			if (user_size1 == available_size[0] || user_size1 == available_size[1] || user_size1 == available_size[2]) {
				System.out.println("size is available");
			} else {
				System.out.println("Please visit our place for better options!!");
			}	}

		System.out.println("Type colour-pink,white");
		String usercolour = sc.next();

		String[] colour_available = { "pink","white" };
		if (usercolour.equalsIgnoreCase(colour_available[0]) || usercolour.equalsIgnoreCase(colour_available[1])) {
			System.out.println("nice choice!!");
		} else {
			System.out.println("oops,colours is not available please try another one");
			String usercolour1 = sc.next();
			if (usercolour1.equalsIgnoreCase(colour_available[0]) || usercolour1.equalsIgnoreCase(colour_available[1])) {
				System.out.println("nice choice!!");
			} else {
				System.out.println("Please visit our place for better options!!");
				}
		}
	}
 	
	
	
}

class Details{
	private String Name;
	private int Mob;
	private String Address;
	
	 public String getName() {
		 return Name;
	 }
	 public void setName(String Name) {
		 this.Name=Name;
	 }
	 
	 public int getMob() {
		 return Mob;
	 }
	 public void setMob(int Mob) {
		 this.Mob=Mob;
	 }
	 
	 public String getAddress() {
		 return Address;
	 }
	 public void setadd(String Address) {
		 this.Address=Address;
	 }

}