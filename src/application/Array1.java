//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);

    int n;
    double height = 0.0;

    System.out.println("Select how many people to het their height: ");
    n = sc.nextInt();
    double[] array = new double[n];

    for(int i = 0; i < n; i++){
        array[i] = sc.nextDouble();
    }

    for(int i = 0; i < n; i++){
        height += array[i];
    }
    height = height /array.length;

    System.out.printf("Average heigth: %.2f\n", height);






    sc.close();
}
