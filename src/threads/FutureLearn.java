package threads;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

// Future and callable goes hands in Hand

public class FutureLearn {

	public static void main(String... args) throws InterruptedException, ExecutionException {

		Functional f = (x) -> System.out.println(x * 100);
		f.play(3222);

		CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			throw new RuntimeException();
		}).handle((a, b) -> "klkllkl");

		System.out.println(future.get());

		CompletableFuture<String> next = future.thenApply(s -> s + "world");

		System.out.println(next.get());

		usingExecutors();
	}

	static void usingExecutors() throws InterruptedException, ExecutionException {
		CompletableFuture<String> completableFuture = new CompletableFuture<>();
		
		Executors.newCachedThreadPool().submit(() -> {
			try {
				Thread.sleep(4000);
				completableFuture.complete("fffffffff");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		
		System.out.println(completableFuture.get());
	}
}

interface Functional {

	public void play(int x);
}
