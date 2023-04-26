package ex05;

public class ButtonExam {

	public static void main(String[] args) {
		Button btnOk = new Button();
		class OkListener implements Button.ClickListener{

			@Override
			public void onClick() {
				System.out.println("OK 버튼을 클릭했습니다");
			}
		}
		
		btnOk.setClickListener(new OkListener());
		btnOk.click();
		
		Button btnCancel = new Button();
		class CancelListener implements Button.ClickListener{

			@Override
			public void onClick() {
				System.out.println("Cancel 버튼을 클릭했습니다");
			}
		}
		
		btnCancel.setClickListener(new CancelListener());
		btnCancel.click();
			
		
		Button btnDoubclick = new Button();
		class DoubclickListener implements Button.ClickListener{

			@Override
			public void onClick() {
				System.out.println("Double click 버튼을 클릭했습니다");
			}
		}
		
		btnDoubclick.setClickListener(new DoubclickListener());
		btnDoubclick.click();
		}

	}

