package step2.model;

import step2.util.LottoGenerator;

import java.util.List;

public class Lotto {

	private static List<Integer> lottoNumbers;

	public Lotto(final LottoGenerator lottoGenerator) {
		lottoNumbers = lottoGenerator.generating();
	}

	public static Lotto generate(LottoGenerator lottoGenerator) {
		return new Lotto(lottoGenerator);
	}

	public int checkHit(final List<Integer> hitNumbers){
		return (int) hitNumbers.stream()
				.mapToInt(num -> num)
				.filter(num -> lottoNumbers.contains(num))
				.count();
	}

	public List<Integer> getLottoNumbers() {
		return lottoNumbers;
	}
}