// Copyright (c) 2020, Oracle Corporation and/or its affiliates.
// Licensed under the Universal Permissive License v 1.0 as shown at https://oss.oracle.com/licenses/upl.

package oracle.kubernetes.weblogic.domain.model;

import oracle.kubernetes.json.Description;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Experimental {

  @Description("Istio service mesh integration configuration.")
  private Istio istio;

  public Experimental istio(Istio istio) {
    this.istio = istio;
    return this;
  }

  public Istio getIstio() {
    return this.istio;
  }

  public void setIstio(Istio istio) {
    this.istio = istio;
  }

  @Override
  public String toString() {
    ToStringBuilder builder =
        new ToStringBuilder(this)
            .append("istio", istio);

    return builder.toString();
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder =
        new HashCodeBuilder()
            .append(istio);

    return builder.toHashCode();
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) {
      return true;
    }
    if (!(other instanceof Experimental)) {
      return false;
    }

    Experimental rhs = ((Experimental) other);
    EqualsBuilder builder =
        new EqualsBuilder()
            .append(istio, rhs.istio);

    return builder.isEquals();
  }

}
