junit-practice
===

# これはJUnit勉強会用の教材です。

* JUnitPractice1〜9に実際にみなさんに書き込んでもらいたいjavaソースファイルを置いている。
* JUnitPractice1Test〜9Testにそれぞれの実装例を置いている。
* クイズではないので、正解があるわけではない。目的は、実際に手を動かして、それぞれどういう動作をするのかを見てもらうこと。  
Ctrl+9とCtrl+0を押しながら作業して欲しい。

# 実行順序

0. QuickJUnitをインストールする。
	0. 手順
		* Eclipse Marketplaceを開き、[ quick junit ]で検索する。
		* Quick JUnit 0.7.0　がヒットするので、これをインストールする。

	0. 使い方
		* Ctrl+9で実装クラスとテストクラスを行き来する。もしテスト実装がなければ作成
		ユーティリティーが実行される。
		* Ctrl+0でカーソル下のテストが実行される。
	0. 強制（必須）ではないが、テスト実行が面倒と感じる方は試してみてほしい。

0. com.aiad.matcher.JUnitPractice1〜5まで実行する。
> JUnit4のassertThat及び各種Matcherに触れる。Matcherの組み立て方や、failした時にどのような
メッセージが出力されるのかを見る。

0. com.aiad.mockito.JUnitPractice6〜9まで実行する。
> Mockitoの使い方に触れる。
> Mockを使ったテストがどのようなものか実際にやってみる。
