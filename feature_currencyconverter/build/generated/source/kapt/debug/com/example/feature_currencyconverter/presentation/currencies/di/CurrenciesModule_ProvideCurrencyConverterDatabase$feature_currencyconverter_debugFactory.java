// Generated by Dagger (https://dagger.dev).
package com.example.feature_currencyconverter.presentation.currencies.di;

import android.content.Context;
import com.example.feature_currencyconverter.data.local.CurrencyConverterDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CurrenciesModule_ProvideCurrencyConverterDatabase$feature_currencyconverter_debugFactory implements Factory<CurrencyConverterDatabase> {
  private final CurrenciesModule module;

  private final Provider<Context> contextProvider;

  public CurrenciesModule_ProvideCurrencyConverterDatabase$feature_currencyconverter_debugFactory(
      CurrenciesModule module, Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public CurrencyConverterDatabase get() {
    return provideCurrencyConverterDatabase$feature_currencyconverter_debug(module, contextProvider.get());
  }

  public static CurrenciesModule_ProvideCurrencyConverterDatabase$feature_currencyconverter_debugFactory create(
      CurrenciesModule module, Provider<Context> contextProvider) {
    return new CurrenciesModule_ProvideCurrencyConverterDatabase$feature_currencyconverter_debugFactory(module, contextProvider);
  }

  public static CurrencyConverterDatabase provideCurrencyConverterDatabase$feature_currencyconverter_debug(
      CurrenciesModule instance, Context context) {
    return Preconditions.checkNotNullFromProvides(instance.provideCurrencyConverterDatabase$feature_currencyconverter_debug(context));
  }
}