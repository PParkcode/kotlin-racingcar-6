package racingcar.io

class Output {
    fun askCarNames() {
        println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)")
    }

    fun askTryNumber() {
        println("시도할 횟수는 몇 회인가요?")
    }

    fun printResultMessage() {
        println()
        println("실행 결과")
    }
}