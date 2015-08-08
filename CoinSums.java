

public class CoinSums {
	
	public static void main(String[] args) {
		long sum = 0L;
		
		for(int a = 0; a < 2; a++) {
			int tmpSumA = 0;
			tmpSumA += (a * 200);
			if(tmpSumA == 200) {
				sum++;
				System.out.println(a);
				System.out.println(sum);
				break;
			} else if(tmpSumA > 200) {
				break;
			} else {
				for(int b = 0; b < 3; b++) {
					int tmpSumB = tmpSumA;
					tmpSumB += (b * 100);
					if(tmpSumB == 200) {
						sum++;
						System.out.println(a + ", " + b);
						System.out.println(sum);
						break;
					} else if(tmpSumB > 200) {
						break;
					} else {
						for (int c = 0; c < 5; c++) {
							int tmpSumC = tmpSumB;
							tmpSumC += (c * 50);
							if(tmpSumC == 200) {
								sum++;
								System.out.println(a + ", " + b + ", " 
									+ c);
								System.out.println(sum);
								break;
							} else if(tmpSumC > 200) {
								break;
							} else {
								for(int d = 0; c < 11; d++) {
									int tmpSumD = tmpSumC;
									tmpSumD += (d * 20);
									if(tmpSumD == 200) {
										sum++;
										System.out.println(a + ", " + b + ", " 
											+ c + ", " + d);
										System.out.println(sum);
										break;
									} else if(tmpSumD > 200) {
										break;
									} else {
										for(int e = 0; e < 21; e++) {
											int tmpSumE = tmpSumD;
											tmpSumE += (e * 10);
											if(tmpSumE == 200) {
												sum++;
												System.out.println(a + ", " + b + ", " 
													+ c + ", " + d + ", " + e);
												System.out.println(sum);
												break;
											} else if(tmpSumE > 200) {
												break;
											} else {
												for(int f = 0; f < 41; f++) {
													int tmpSumF = tmpSumE;
													tmpSumF += (f * 5);
													if(tmpSumF == 200) {
														sum++;
														System.out.println(a + ", " + b + ", " 
															+ c + ", " + d + ", " + e + ", "
															+ f);
														System.out.println(sum);
														break;
													} else if(tmpSumF > 200) {
														break;
													} else {
														for(int g = 0; g < 101; g++) {
															int tmpSumG = tmpSumF;
															tmpSumG += (g * 2);
															if(tmpSumG == 200) {
																sum++;
																System.out.println(a + ", " + b + ", "
																	+ c + ", " + d + ", " + e + ", "
																	+ f + ", " + g);
																System.out.println(sum);
																break;
															} else if(tmpSumG > 200) {
																break;
															} else {
																for(int h = 0; h < 201; h++) {
																	int tmpSumH = tmpSumG;
																	tmpSumH += h;
																	if(tmpSumH == 200) {
																		sum++;
																		System.out.println(a + ", " + b + ", " 
																			+ c + ", " + d + ", " + e + ", " 
																			+ f + ", " + g + ", " +h);
																		System.out.println(sum);
																		break;
																	} else if(tmpSumH > 200) {
																		break;
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println(sum);
	}
}