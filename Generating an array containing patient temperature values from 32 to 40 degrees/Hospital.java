package practice.hospital;

public class Hospital {

    public static float[] generatePatientsTemperatures(int patientsCount) {
        float[] patientTemp = new float[patientsCount];

        for (int i = 0; i < patientsCount; i++) {
            float pow = (float) Math.pow(10, 1);
            patientTemp[i] = (float) (Math.ceil(((float) (Math.random() * 8) + 32) * pow) / pow);
        }

        return patientTemp;
    }
    public static String getReport(float[] temperatureData) {
        int count = 0;
        int health = 0;
        String patients = "";
        float temp = 0;
        double middleTemp = 0;
        for (int i = 0; i < temperatureData.length; i++) {
            patients += temperatureData[i] + " ";
            temp += temperatureData[i];
            if (temperatureData [i] < 36.2F || temperatureData [i] > 36.9F) {
                count++;
            } else {
                count++;
                health++;
            }
        }
        middleTemp = Math.rint(temp / count * 100) / 100;

        String report =
            "Температуры пациентов: " + patients.substring(0,patients.length()-1) +
            "\nСредняя температура: " + middleTemp +
            "\nКоличество здоровых: " + health;

        return report;
    }
}


        /*
        TODO: Напишите код, который выводит среднюю температуру по больнице,количество здоровых пациентов,
            а также температуры всех пациентов.
            Округлите среднюю температуру с помощью Math.round до 2 знаков после запятой,
            а температуры каждого пациента до 1 знака после запятой
        */

