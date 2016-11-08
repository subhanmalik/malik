c class Bankaccount{
  	
		 int credit=500;
		 	 
			 		public double cashwithdraw(int amount)
							{	if(amount<0  || amount>credit)
							        		system.out.print("invalid amount");
													
																else
																    				credit=credit-amount; 
																				                              
																							      				return credit;
																											                     
																													     	}
																														 
																														 		public double cashdeposit(double deposit)
																																         	{ credit=credit+deposit;
																																		                    return credit;
																																				    			
																																									}
																																											
																																													public double remainingbalance(int amount,int credit)
																																															{
																																															   			return credit;
																																																				}
																																																				  
																																																				  		public double updatebalance(int credit)
																																																								  { if(credit>100000)
																																																								                     credit=(0.1*100000)+credit;
																																																										     		  }
																																																												  		 return credit;
																																																														 			
																																																																			}
																																																																			}
